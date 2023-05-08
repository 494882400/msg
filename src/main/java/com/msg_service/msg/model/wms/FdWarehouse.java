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
    * 仓库资料表
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FdWarehouse {
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
    * 管理员
    */
    private String manage_name;

    /**
    * 联系人
    */
    private String contact_name;

    /**
    * 地址
    */
    private String warehouse_addr;
}