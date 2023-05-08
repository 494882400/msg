package com.msg_service.msg.model.wms;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * LED公告维护表
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysLedNotice {
    /**
    * 公告ID
    */
    private String proclamation_id;

    /**
    * 公告类型
    */
    private String proclamation_type;

    /**
    * 公告内容
    */
    private String proclamation_content;

    /**
    * 是否显示
    */
    private Integer is_show;
}