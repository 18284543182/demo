package com.example.demo.Proxy;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Cat implements Eat {

    @Override
    public void eat() {
        log.info("猫吃东西...");
    }

}
