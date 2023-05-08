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
    * 商品召回表接口表
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InfGoodRecall {
    /**
    * 序号
    */
    private String seq_no;

    /**
    * 委托方编号
    */
    private String con_no;

    /**
    * 单据编号
    */
    private String biz_bill_no;

    /**
    * 商品ID
    */
    private String goods_id;

    /**
    * 商品批号
    */
    private String goods_lotno;

    /**
    * 是否取消召回
    */
    private String cancel_recall;

    /**
    * 删除标识
    */
    private String delete_flag;

    /**
    * 商品内码
    */
    private String goods_id_old;

    /**
    * 状态
    */
    private String status;
}