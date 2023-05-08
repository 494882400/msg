package com.msg_service.msg.model.wms;

import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * 
*/
/**
    * 商品复检通知明细单
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GspGoodsrecheckDtl {
    /**
    * 单据id
    */
    private Long bill_hdr_id;

    /**
    * 明细ID
    */
    private String bill_dtl_id;

    /**
    * 收货明细ID
    */
    private String ish_bill_dtl_id;

    /**
    * 节点
    */
    private String node;

    /**
    * 商品ID
    */
    private Long goods_id;

    /**
    * 批号ID
    */
    private Long batch_id;

    /**
    * 批号
    */
    private String batch_no;

    /**
    * 生产日期
    */
    private Date production_date;

    /**
    * 有效期
    */
    private Date valid_until;

    /**
    * 复检数量
    */
    private BigDecimal recheck_qty;

    /**
    * 图片地址
    */
    private String image_address;

    /**
    * 审核人
    */
    private String auditor;

    /**
    * 审核意见
    */
    private String audit_opinion;

    /**
    * 审核时间
    */
    private Date audit_time;

    /**
    * 合格数量
    */
    private BigDecimal qualification_qty;

    /**
    * 不合格数量
    */
    private BigDecimal disqualification_qty;

    /**
    * 复检状态
    */
    private String recheck_state;
}