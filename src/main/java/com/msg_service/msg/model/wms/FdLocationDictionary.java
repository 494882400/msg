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
    * 货位字典
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FdLocationDictionary {
    /**
    * 货位ID
    */
    private Long location_id;

    /**
    * 货位编号
    */
    private String location_no;

    /**
    * 区域ID
    */
    private Long area_id;

    /**
    * 区域NO
    */
    private String area_no;

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
    * 库房id
    */
    private Long storeroom_id;

    /**
    * 整散标志
    */
    private String storeroom_no;

    /**
    * 库房名称
    */
    private String storeroom_name;

    /**
    * 电子标签地址
    */
    private String dps_addr;

    /**
    * 电子标签类型
    */
    private String dps_type;

    /**
    * 控制器编号
    */
    private String controller_no;

    /**
    * 楼层
    */
    private String floor_no;

    /**
    * 逻辑区域
    */
    private String logical_area;

    /**
    * 巷道
    */
    private String roadway;

    /**
    * 组
    */
    private String location_group;

    /**
    * 排
    */
    private String location_row;

    /**
    * 列
    */
    private String location_column;

    /**
    * 层
    */
    private String layer;

    /**
    * 长
    */
    private BigDecimal location_length;

    /**
    * 宽
    */
    private BigDecimal location_width;

    /**
    * 高
    */
    private BigDecimal location_height;

    /**
    * 体积
    */
    private BigDecimal location_volume;

    /**
    * 占用体积
    */
    private BigDecimal occupied_volume;

    /**
    * 库存品规数
    */
    private BigDecimal location_stock_num;
}