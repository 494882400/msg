package com.msg_service.msg.utils;


import com.msg_service.msg.model.Result;
import com.msg_service.msg.utils.Test.LogAop;
import com.msg_service.msg.utils.Test.OrderService;
import com.msg_service.msg.utils.Test.OrderServiceImpl;
import com.msg_service.msg.utils.Test.ProxyFactory;

/**
 *
 */
public class tEST {


    public static void main(String[] args) {
        OrderService o = (OrderService) ProxyFactory.ProxyFactory(new OrderServiceImpl(),new LogAop());
        Result result = o.prodOrder("测试参数");
    }

}
