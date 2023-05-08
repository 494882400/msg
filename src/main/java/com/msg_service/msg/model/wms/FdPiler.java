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
    * 堆垛机资料表
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FdPiler {
    /**
    * 堆垛机ID
    */
    private Long piler_id;

    /**
    * 堆垛机编号
    */
    private String piler_no;

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
    * 所在巷道
    */
    private String roadway;

    /**
    * 是否可用
    */
    private Integer is_activation;

    /**
    * 是否冻结
    */
    private Integer is_freeze;

    /**
    * 前一堆垛机ID
    */
    private Long pre_piler_id;

    /**
    * 后一堆垛机ID
    */
    private Long next_piler_id;
}