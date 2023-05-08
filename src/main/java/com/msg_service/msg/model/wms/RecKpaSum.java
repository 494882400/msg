package com.msg_service.msg.model.wms;

import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 人员绩效统计表
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecKpaSum {
    /**
    * 主键
    */
    private Long work_sum_id;

    /**
    * 日期
    */
    private Date sum_date;

    /**
    * 人员ID
    */
    private String staff_id;

    /**
    * 考核角色
    */
    private String evaluation_role;

    /**
    * 数量
    */
    private BigDecimal work_sum;

    /**
    * 仓库ID
    */
    private Long warehouse_id;
}