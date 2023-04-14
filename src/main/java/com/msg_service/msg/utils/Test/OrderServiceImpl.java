package com.msg_service.msg.utils.Test;

import com.msg_service.msg.model.Result;

/**
 *
 */
public class OrderServiceImpl implements OrderService{

    @Override
    public Result prodOrder(String s) {
        Result result = new Result();
        result.setFlag(true);
        result.setMsgInfo("动态代理测试!" + s);
        return result;
    }
}
