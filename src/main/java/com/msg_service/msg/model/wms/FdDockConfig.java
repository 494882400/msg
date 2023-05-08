package com.msg_service.msg.model.wms;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
    * 卸货档口车辆类型配置表
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FdDockConfig {
    /**
    * 档口配置ID
    */
    private String dock_config_id;

    /**
    * 档口ID
    */
    private Long dock_id;

    /**
    * 档口编号
    */
    private String dock_no;

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
    * 库房ID
    */
    private Long storeroom_id;

    /**
    * 库房编号
    */
    private String storeroom_no;

    /**
    * 车辆类型
    */
    private String vehicle_cate;

    /**
    * 商品类型
    */
    private String goods_type;
}