package com.msg_service.msg.model.wms;

import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 重点品种渠道申请表
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GspGoodsChannel {
    /**
    * 仓库ID
    */
    private Long warehouse_id;

    /**
    * 委托方编号
    */
    private String con_no;

    /**
    * 开票日期
    */
    private Date invoice_time;

    /**
    * 供应商单位ID
    */
    private Long supplier_unit_id;

    /**
    * 商品ID
    */
    private String goods_id;

    /**
    * 渠道分类
    */
    private String channel_type;
}