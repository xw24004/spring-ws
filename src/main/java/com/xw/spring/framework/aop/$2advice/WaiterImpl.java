package com.xw.spring.framework.aop.$2advice;

public class WaiterImpl implements Waiter {

    @Override
    public void GreatTo(String name) {
        System.out.println("GreatTo " + name + "!");
    }

    @Override
    public void serveTo(String name) {
        System.out.println("serveTo " + name + "!");
    }
}
