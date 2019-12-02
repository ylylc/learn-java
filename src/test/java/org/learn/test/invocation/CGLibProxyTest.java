package org.learn.test.invocation;

import org.learn.invocation.CarCGLibProxy;
import org.learn.invocation.service.impl.BMWCarSerivice;

public class CGLibProxyTest {

    public static void main(String args []){
        BMWCarSerivice bmwCarSerivice = new BMWCarSerivice();

        CarCGLibProxy carCGLibProxy = new CarCGLibProxy();
        BMWCarSerivice bmwProxy = (BMWCarSerivice) carCGLibProxy.bind(bmwCarSerivice);
        bmwProxy.sayHello();

    }
}
