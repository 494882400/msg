package com.msg_service.msg.model.wms;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 库房资料表
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FdStoreroom {
    /**
    * 库房id
    */
    private Long storeroom_id;

    /**
    * 库房编号
    */
    private String storeroom_no;

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
    * 库房名称
    */
    private String storeroom_name;

    /**
    * 库房类型
    */
    private String storeroom_type;

    /**
    * 是否启用
    */
    private Integer is_activation;

    /**
    * 库管员
    */
    private Long storeroom_manage_id;

    /**
    * 备注
    */
    private String remark;

    /**
    * 单品重量
    */
    private BigDecimal single_weight;
}