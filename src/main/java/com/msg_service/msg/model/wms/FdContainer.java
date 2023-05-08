package com.msg_service.msg.model.wms;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 容器资料表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FdContainer {
    /**
     * 容器ID
     */
    private Long container_id;

    /**
     * 容器编号
     */
    private String container_no;

    /**
     * 仓库ID
     */
    private Long warehouse_id;

    /**
     * 容器类型
     */
    private String container_type;

    /**
     * 容器状态
     */
    private String container_status;

    /**
     * 分配单编号
     */
    private String taskbill_no;

    /**
     * 货位ID
     */
    private Long location_id;

    /**
     * 货位编号
     */
    private String location_no;
}