package com.xw.spring.framework.ioc2.$1simple;

public class Car {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "car.name=" + name;
    }

}
