package com.msg_service.msg.utils.Test;

/**
 *
 */
public class LogAop implements Aop{
    @Override
    public void before(String S) {
        System.out.println("前置日志输出 入参:" + S);
    }

    @Override
    public void after(String S) {
        System.out.println("后置日志输出 出参:"  + S);
    }
}
