package com.xw.spring.framework.ioc2.$1simple;

public class CarFactory {

    public Car createBMWCar() {
        Car car = new Car();
        car.setName("宝马工厂生产：宝马");
        return car;
    }

    public static Car createCar() {
        Car car = new Car();
        car.setName("静态工厂：宝马");
        return car;
    }
}
