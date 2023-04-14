package com.msg_service.msg.model;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
@Data
public class WxMsgBody {

    private String touser;

    private String template_id;

    private String url;

    private String topcolor;

    private Map<String,Map<String,String>> data;

    public static Map<String,String> getData(String a, String b){
        Map<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("value",a);
        stringStringHashMap.put("color",b);
        return stringStringHashMap;
    }

}
