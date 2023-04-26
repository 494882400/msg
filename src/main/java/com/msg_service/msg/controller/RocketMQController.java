package com.msg_service.msg.controller;

import com.msg_service.msg.model.Result;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RequestMapping("/rocketmq")
@RestController
public class RocketMQController {

    @Autowired
    RocketMQTemplate rocketMQTemplate;

    @PostMapping("/produceMsg")
    public Result produceMsg(@RequestBody String inputJson){
        Result result = new Result();
        result.setFlag(true);
        SendResult testProduceMsg = rocketMQTemplate.syncSend("TestProduceMsg", inputJson);
        result.setMsgInfo(testProduceMsg.toString());
        return result;
    }

}
