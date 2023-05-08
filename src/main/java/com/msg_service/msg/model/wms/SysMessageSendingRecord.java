package com.msg_service.msg.model.wms;

import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 消息发送记录
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysMessageSendingRecord {
    /**
    * 消息配置ID
    */
    private Long message_config_id;

    /**
    * 消息ID
    */
    private Long message_id;

    /**
    * 消息内容
    */
    private String message_content;

    /**
    * 消息图片
    */
    private String message_img;

    /**
    * 消息发送人
    */
    private String message_sender;

    /**
    * 消息接收人
    */
    private String message_receiver;

    /**
    * 消息发送方式
    */
    private String message_sending_method;

    /**
    * 消息发送联系方式
    */
    private String message_sending_contact_method;

    /**
    * 消息跳转界面链接
    */
    private String message_jump_link;

    /**
    * 发送时间
    */
    private Date sendtime;

    /**
    * 消息读取状态
    */
    private String message_read_status;

    /**
    * 备注
    */
    private String remark;
}