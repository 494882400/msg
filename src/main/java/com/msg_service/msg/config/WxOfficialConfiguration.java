package com.msg_service.msg.config;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.time.Duration;
import java.util.Date;

/**
 *
 */
@Configuration
@EnableConfigurationProperties(WxOfficialProperties.class)
public class WxOfficialConfiguration {

    @Autowired
    private WxOfficialProperties wxOfficialProperties;

    @Autowired
    private RestTemplate restTemplate;

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @PostConstruct
    public void init(){
        refreshToken();
    }

    @Scheduled(initialDelay = 7100*1000 ,fixedRate= 7100*1000)
    public void refreshToken(){

        String format = String.format(wxOfficialProperties.getTokenurl(), wxOfficialProperties.getAppid(), wxOfficialProperties.getAppsecret());
        String result = restTemplate.getForObject(format, String.class);

        JSONObject jsonObject = JSONObject.parseObject(result);
        String access_token = jsonObject.get("access_token").toString();


        if (StringUtils.hasText(access_token)){

            stringRedisTemplate.opsForValue().set(wxOfficialProperties.getAppid()+"-lyf",access_token, Duration.ofSeconds(7200));
        }else {
            System.out.println(format +" --- "+result);
        }
    }
}
