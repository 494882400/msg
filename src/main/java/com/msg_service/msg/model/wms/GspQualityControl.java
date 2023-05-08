package com.msg_service.msg.model.wms;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 集团质量管控表
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GspQualityControl {
    /**
    * 序号
    */
    private String seq_no;

    /**
    * 集团内码
    */
    private String group_code;

    /**
    * 执行意见
    */
    private String executive_opinion;

    /**
    * 控制开始日期
    */
    private Date control_begindate;

    /**
    * 控制结束日期
    */
    private Date control_enddate;

    /**
    * 注销批准文号
    */
    private String cancel_approval_no;

    /**
    * 注销批准文号日期
    */
    private Date cancel_approval_no_date;

    /**
    * 批号
    */
    private String batch_no;

    /**
    * 质量问题项
    */
    private String quality_problem;

    /**
    * 是否审核
    */
    private String is_audited;
}