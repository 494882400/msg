package com.msg_service.msg.model.wms;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 月台资料表
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FdStagingarea {
    /**
    * 月台ID
    */
    private Long stagingarea_id;

    /**
    * 月台编号
    */
    private String stagingarea_no;

    /**
    * 仓库ID
    */
    private Long warehouse_id;

    /**
    * 仓库编号
    */
    private String warehouse_no;

    /**
    * 仓库名称
    */
    private String warehouse_name;

    /**
    * 月台类型
    */
    private String stagingarea_type;

    /**
    * 月台类别
    */
    private String stagingarea_cate;

    /**
    * 月台描述
    */
    private String stagingarea_desc;

    /**
    * 货主编号
    */
    private String owner_no;

    /**
    * 是否锁定
    */
    private Integer is_locked;

    /**
    * 业务类型
    */
    private String business_type;

    /**
    * 方向ID
    */
    private Long direction_id;

    /**
    * 提货方式
    */
    private String takegoods_mode;

    /**
    * 单据数
    */
    private BigDecimal bill_num;

    /**
    * 客户ID
    */
    private Long customer_id;

    /**
    * 单据抬头ID
    */
    private Long bill_hdr_id;

    /**
    * 计划件数
    */
    private BigDecimal planned_pcs;

    /**
    * 实际件数
    */
    private BigDecimal actual_pcs;

    /**
    * 集货复核校验货位
    */
    private String check_location;
}