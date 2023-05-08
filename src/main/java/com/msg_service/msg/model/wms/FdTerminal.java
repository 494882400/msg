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
    * 终端资料表
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FdTerminal {
    /**
    * 设备IP地址
    */
    private String terminals_ip;

    /**
    * 仓库ID
    */
    private Long warehouse_id;

    /**
    * 设备状态
    */
    private String terminals_status;

    /**
    * 设备类型
    */
    private String terminals_type;

    /**
    * 操作员
    */
    private String operator;

    /**
    * 打印机地址
    */
    private String printer_addr;

    /**
    * 备注
    */
    private String remark;
}