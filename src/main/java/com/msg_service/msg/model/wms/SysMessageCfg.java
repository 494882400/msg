package com.msg_service.msg.model.wms;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * 
*/
/**
    * 消息配置表
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysMessageCfg {
    /**
    * 消息配置ID
    */
    private String message_config_id;

    /**
    * 消息类型
    */
    private String message_type;

    /**
    * 消息接收人
    */
    private String message_receiver;

    /**
    * 消息接收人联系方式
    */
    private String message_receiver_contact;

    /**
    * 消息发送
    */
    private String message_sender;

    /**
    * 消息发送时间段
    */
    private Date message_sending_period;

    /**
    * 消息发送频次
    */
    private String message_sending_frequency;
}