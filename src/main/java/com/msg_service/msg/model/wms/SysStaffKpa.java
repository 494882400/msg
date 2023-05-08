package com.msg_service.msg.model.wms;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 考核加扣分表
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysStaffKpa {
    /**
    * 记录ID
    */
    private String rec_id;

    /**
    * 库房ID
    */
    private Long warehouse_id;

    /**
    * 业务类型
    */
    private String business_type;

    /**
    * 作业节点
    */
    private String job_node;

    /**
    * 错误类别
    */
    private String mistake_cate;

    /**
    * 差错反馈人
    */
    private String mistake_feedbacker;

    /**
    * 考核责任人
    */
    private String evaluation_charger;

    /**
    * 核实人
    */
    private String verifier;

    /**
    * 审核人员
    */
    private String auditor;

    /**
    * 客户ID
    */
    private Long customer_id;

    /**
    * 商品ID
    */
    private Long goods_id;

    /**
    * 计划数量
    */
    private BigDecimal planned_qty;

    /**
    * 实际数量
    */
    private BigDecimal actual_qyt;

    /**
    * 应发批号
    */
    private String planned_lotno_id;

    /**
    * 实发批号
    */
    private String actual_lotno_id;

    /**
    * 实发规格
    */
    private String actual_drug_spec;

    /**
    * 实发厂家
    */
    private String actual_manufacturer;

    /**
    * 备注
    */
    private String remark;

    /**
    * 备注2
    */
    private String remark2;

    /**
    * 备注3
    */
    private String remark3;

    /**
    * 岗位类别
    */
    private String post_cate;

    /**
    * 反馈人加分
    */
    private String feedbacker_plus;

    /**
    * 责任人扣分
    */
    private String charger_minus;

    /**
    * 状态
    */
    private String status;

    /**
    * 录入人
    */
    private String recoeder;

    /**
    * 区域ID
    */
    private Long area_id;

    /**
    * 差错原因
    */
    private String mistake_reasons;

    /**
    * 是否有效
    */
    private Integer is_enable;
}