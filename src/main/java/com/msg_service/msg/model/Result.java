package com.msg_service.msg.model;

import lombok.Data;

/**
 *
 */
@Data
public class Result {

    private Boolean flag = false;

    private String msgInfo;

    private String errInfo;

}
