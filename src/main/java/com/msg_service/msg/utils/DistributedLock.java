package com.msg_service.msg.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.script.DefaultRedisScript;
import org.springframework.data.redis.core.script.RedisScript;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Component
public class DistributedLock {

    private static final String LOCK_KEY = "my_lock";
    private static final int LOCK_EXPIRY = 300; // 锁到期时间
    private static final int LOCK_WAIT_TIMEOUT = 10; // 锁定等待超时（秒）
    private static final int LOCK_ACQUIRE_RETRY_INTERVAL = 100; // 重试间隔（毫秒）

    @Autowired
    private StringRedisTemplate redisTemplate;

    public boolean acquireLock() {
        String lockValue = UUID.randomUUID().toString();
        lockValue = Thread.currentThread().getName() +"-"+ lockValue;
        long startTime = System.currentTimeMillis();
        while (true) {
            Boolean lockAcquired = redisTemplate.opsForValue().setIfAbsent(LOCK_KEY, lockValue, LOCK_EXPIRY, TimeUnit.SECONDS);
            if (lockAcquired != null && lockAcquired) {
                return true; // 获取锁成功
            } else {
                // 未获取锁，等待一段时间，然后重试
                try {
                    Thread.sleep(LOCK_ACQUIRE_RETRY_INTERVAL);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // 检查等待时长是否已超过
                long elapsedTime = System.currentTimeMillis() - startTime;
                if (elapsedTime > LOCK_WAIT_TIMEOUT * 1000) {
                    return false; // 获取失败
                }
            }
        }
    }

    public void releaseLock() {
        RedisScript<Long> releaseLockScript = new DefaultRedisScript<>(
                "if redis.call('get', KEYS[1]) == ARGV[1] then\n" +
                        "    return redis.call('del', KEYS[1])\n" +
                        "else\n" +
                        "    return 0\n" +
                        "end",
                Long.class
        );
        redisTemplate.execute(releaseLockScript, Collections.singletonList(LOCK_KEY), redisTemplate.getRequiredConnectionFactory().getConnection(), redisTemplate.getValueSerializer(), redisTemplate.getValueSerializer());
    }
}
