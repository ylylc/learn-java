package org.learn.invocation;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

@Slf4j
public class CarInvocationHandler<T> implements InvocationHandler {

    //代理对象
    private T target;

    public CarInvocationHandler (T target){
        this.target  =  target;
    }


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        log.info("执行方法前");
        method.invoke(target,args);

        log.info("执行方法后");

        return null;
    }
}
