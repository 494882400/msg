package com.msg_service.msg.utils.Test;

import com.msg_service.msg.model.Result;

/**
 *
 */
public interface OrderService {

    default Result prodOrder(String s){return null;}

}
