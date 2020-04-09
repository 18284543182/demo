package com.example.demo.Proxy;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StaticProxyAnimal implements Eat {

    private Eat impl;

    public StaticProxyAnimal(Eat impl){
        this.impl=impl;
    }

    @Override
    public void eat() {
        log.info("猫饿了");
        impl.eat();
    }

    public static void main(String[] args) {
        Eat proxy = new StaticProxyAnimal(new Cat());
        proxy.eat();
    }
}
