package org.learn.invocation.service.impl;

import lombok.extern.slf4j.Slf4j;

import org.learn.invocation.service.ICarService;

@Slf4j
public class BMWCarSerivice implements ICarService {
    public void sayHello() {
        log.info("嗨，我是宝马汽车");
    }
}
