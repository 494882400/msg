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
    * 说明书修订表
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GspGoodsInstructions {
    /**
    * 发布日期
    */
    private Date publishdate;

    /**
    * 通用名称
    */
    private String commonname;

    /**
    * 双跨品种
    */
    private String douvarieties;

    /**
    * 最晚备案日期
    */
    private Date lastfilingdate;

    /**
    * 最晚更换日期
    */
    private Date lastrevisedate;
}