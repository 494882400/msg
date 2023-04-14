package com.msg_service.msg.utils.Test;

/**
 *
 */
public interface Aop {

    default void before(String s){};
    default void after(String s){};
    default void exception(){};

}
