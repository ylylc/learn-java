package org.learn.invocation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

@Slf4j
public class CarCGLibProxy {

    Object object;

    public Object bind(final Object target){

        this.object = target;

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(object.getClass());
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy)
                    throws Throwable {
                log.info("执行前");
                Object res = method.invoke(target,objects);
                log.info("执行后");
                return res;
            }
        });
       return enhancer.create();
    }




}
