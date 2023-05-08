package com.msg_service.msg.model.wms;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 条码规则配置
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RuleBarcode {
    /**
    * 条码规则ID
    */
    private String barcode_rule_id;

    /**
    * 仓库ID
    */
    private Long warehouse_id;

    /**
    * 条码类型
    */
    private String barcode_type;

    /**
    * 最小长度
    */
    private BigDecimal min_length;

    /**
    * 最大长度
    */
    private BigDecimal max_length;

    /**
    * 条码前缀
    */
    private String barcode_prefix;

    /**
    * 条码后缀
    */
    private String barcode_suffix;

    /**
    * 条码表达式
    */
    private String barcode_regex;

    /**
    * 备注
    */
    private String remark;
}