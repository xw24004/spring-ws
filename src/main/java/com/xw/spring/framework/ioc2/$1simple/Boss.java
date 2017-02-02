package com.xw.spring.framework.ioc2.$1simple;

public class Boss {
    private Car car;
    private String name;

    public Boss(Car car, String name) {
        super();
        this.car = car;
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
