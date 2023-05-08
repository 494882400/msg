package com.msg_service.msg.controller.json;

import cn.hutool.json.JSONObject;
import com.alibaba.fastjson.JSON;
import com.msg_service.msg.controller.json.A;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RequestMapping("/test")
@RestController
public class TestController {

    @GetMapping("/a")
    public A test(){
        A a = new A();
        a.setFlag("true");
        a.setResult(JSON.toJSONString(a));
        return a;
    }

}
