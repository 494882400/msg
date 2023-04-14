package com.msg_service.msg.utils.Test;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 *
 */
public class ProxyFactory {

    public static Object ProxyFactory(OrderService orderService,Aop aop){
        return Proxy.newProxyInstance(
                orderService.getClass().getClassLoader(),
                orderService.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        aop.before(Arrays.toString(args));
                        Method[] methods = proxy.getClass().getMethods();
                        System.out.println("方法数:"+methods.length);
                        Object invoke = method.invoke(orderService,args);
                        System.out.println(invoke.toString());
                        aop.after(invoke.toString());
                        return invoke;
                    }
                }
        );
    }

}
