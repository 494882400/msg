package com.msg_service.msg.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.msg_service.msg.config.WxOfficialProperties;
import com.msg_service.msg.mapper.HongzhaMapper;
import com.msg_service.msg.model.Hongzha;
import com.msg_service.msg.model.Result;
import com.msg_service.msg.model.WxMsgBody;
import com.msg_service.msg.service.MsgService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import javax.xml.crypto.Data;
import java.util.*;

/**
 *
 */
@Service
@Slf4j
public class MsgServiceImpl implements MsgService {
    private static List<Hongzha> hongzhas;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private HongzhaMapper hongzhaMapper;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private WxOfficialProperties wxOfficialProperties;

    @Override
    public Result sendMsg() {
        Result result = new Result();
        result.setFlag(true);
        result.setMsgInfo("发送成功!");
        return result;
    }
    @PostConstruct
    public void init(){
        hongzhas = hongzhaMapper.selectAll();
    }

    @Override
    public Result sendWxMsg() {
        Result result1 = new Result();
        // 从redis中获取token
        String token = stringRedisTemplate.opsForValue().get(wxOfficialProperties.getAppid() + "-lyf");
        String format = String.format(wxOfficialProperties.getMsgurl(), token);
        //hongzhas = hongzhaMapper.selectAll();
        WxMsgBody wxMsgBody;
        synchronized (this){
            Random random = new Random();
            int i = random.nextInt(hongzhas.size() - 1);
            log.info("-------------------------------------");
            log.info("本轮轰炸对象: {}",hongzhas.get(i).getUsername());
            log.info("-------------------------------------");
            wxMsgBody = new WxMsgBody();
            wxMsgBody.setTouser(hongzhas.get(i).getTouser());
        }
        wxMsgBody.setTemplate_id("ZVSp8QldnelOV1HzKRZumExXNXarZHv-Qd-TidUHx9o");
        wxMsgBody.setUrl("https://www.56jzt.com");
        wxMsgBody.setTopcolor("#FF0000");
        Map<String, Map<String, String>> map = new HashMap<>();
        map.put("time",WxMsgBody.getData(new Date().toString(),"#173177"));
        map.put("goods",WxMsgBody.getData("一夜奇迹生发剂——程序员专用","#173177"));
        map.put("money",WxMsgBody.getData("99998","#173177"));
        map.put("yue",WxMsgBody.getData("199990000.09","#173177"));
        wxMsgBody.setData(map);
        String result = restTemplate.postForObject(format, wxMsgBody, String.class);
        JSONObject jsonObject = JSONObject.parseObject(result);
        String errmsg = jsonObject.get("errmsg").toString();
        if (errmsg.equals("ok")){
            result1.setFlag(true);
            return result1;
        }else {
            return result1;
        }
    }


}
