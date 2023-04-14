package com.msg_service.msg.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

/**
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ConfigurationProperties(prefix = "wx")
public class WxOfficialProperties {


    private String appid;
    private String appsecret;
    private String tokenurl;
    private String msgurl;

}
