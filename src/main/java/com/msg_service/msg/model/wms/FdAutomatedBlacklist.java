package com.msg_service.msg.model.wms;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 自动化黑名单
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FdAutomatedBlacklist {
    /**
    * 配置ID
    */
    private Long black_list_config_id;

    /**
    * 仓库ID
    */
    private Long warehouse_id;

    /**
    * 商品大类
    */
    private String goods_cate;

    /**
    * 剂型
    */
    private String dosage_form;

    /**
    * 商品编号
    */
    private String goods_no;

    /**
    * 逻辑区域
    */
    private String logical_area;

    /**
    * 备注
    */
    private String remark;
}