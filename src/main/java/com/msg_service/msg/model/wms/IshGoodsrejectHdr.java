package com.msg_service.msg.model.wms;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * 
*/
/**
    * 商品拒收通知汇总单
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IshGoodsrejectHdr {
    /**
    * 单据id
    */
    private Long bill_hdr_id;

    /**
    * 上级单据ID
    */
    private String super_bill_hdr_id;

    /**
    * 当前节点
    */
    private String current_node;

    /**
    * 下一节点
    */
    private String next_node;

    /**
    * 状态
    */
    private String status;

    /**
    * 客户ID
    */
    private Long customer_id;

    /**
    * 客户编号
    */
    private String customer_no;

    /**
    * 客户名称
    */
    private String customer_name;
}