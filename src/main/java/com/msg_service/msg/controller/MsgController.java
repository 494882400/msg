package com.msg_service.msg.controller;

import com.msg_service.msg.model.Result;
import com.msg_service.msg.service.MsgService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
@RequestMapping("/msg")
@Slf4j
public class MsgController {

    public static int i = 1;
    @Autowired
    MsgService msgService;

    @GetMapping("/sendMsg")
    public Result sendMsg(){
        return msgService.sendMsg();
    }

    @GetMapping("/sendWxMsg")
    //@Scheduled(cron = "0 00 08 ? * * ")
    //@Scheduled(cron = "0/30 * * * * ?")
    public Result sendWxMsg(){

        log.info("第 "+i+" 次执行 . . .");
        Result result = msgService.sendWxMsg();
        i = i + 1 ;
        return result;
    }

}
