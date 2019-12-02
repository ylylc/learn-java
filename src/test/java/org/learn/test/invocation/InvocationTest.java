package org.learn.test.invocation;


import lombok.extern.slf4j.Slf4j;
import org.learn.invocation.CarInvocationHandler;
import org.learn.invocation.service.ICarService;
import org.learn.invocation.service.impl.BMWCarSerivice;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

@Slf4j
public class InvocationTest {

    public static void main(String args []){
        ICarService target = new BMWCarSerivice();

        InvocationHandler invocationHandler = new CarInvocationHandler(target);

        log.info("开始");
        ICarService carService = (ICarService) Proxy.newProxyInstance(ICarService.class.getClassLoader(),
                new Class<?>[]{ICarService.class},invocationHandler);
        carService.sayHello();

    }

}
