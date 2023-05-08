package com.msg_service.msg.model.wms;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 区域表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FdArea {
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
     * 库房编号
     */
    private String storeroom_no;

    /**
     * 库房名称
     */
    private String storeroom_name;

    /**
     * 整散标志
     */
    private String package_sign;

    /**
     * 作业分组
     */
    private String oper_group;

    /**
     * 拣货设备标识
     */
    private String pickdev_sign;

    /**
     * 上架方式
     */
    private String upshelf_mode;

    /**
     * 是否提前拣选
     */
    private Integer is_prepick;

    /**
     * 是否使用分拣机
     */
    private Integer is_use_sorter;

    /**
     * 内复核标识
     */
    private String inchk_type;

    /**
     * 满载周转箱数
     */
    private Long fully_loaded_totebox_num;

    /**
     * 打包体积
     */
    private Long bale_volume;

    /**
     * 是否强制存储要求
     */
    private Integer is_force_storage_requirement;
}