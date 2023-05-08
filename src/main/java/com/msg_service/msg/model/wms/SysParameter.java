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
    * 货主参数维护表
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysParameter {
    /**
    * 参数编号
    */
    private String para_no;

    /**
    * 租户ID
    */
    private Long tenant_id;

    /**
    * 仓库ID
    */
    private Long warehouse_id;

    /**
    * 参数含义
    */
    private String para_desc;

    /**
    * 参数值
    */
    private String para_value;

    /**
    * 参数标识
    */
    private String para_sign;

    /**
    * 备注
    */
    private String remark;
}