package com.xw.spring.framework.ioc.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

public class CarReflectTest {

    @Test
    public void initDefaultConstruct() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
            InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        // 1.装载classLoader
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class<?> clazz = classLoader.loadClass("com.xw.spring.framework.ioc.reflect.Car");

        // 2.初始化
        Constructor<?> carConstructor = clazz.getDeclaredConstructor((Class[]) null);
        Car car = (Car) carConstructor.newInstance();

        // 3.方法
        Method setBrand = clazz.getMethod("setBrand", String.class);
        setBrand.invoke(car, "宝马");
        Method setColor = clazz.getMethod("setColor", String.class);
        setColor.invoke(car, "红色");
        Method setMaxSpeed = clazz.getMethod("setMaxSpeed", int.class);
        setMaxSpeed.invoke(car, 200);
        car.introduce();
    }

    @Test
    public void initConstructorByParams() throws Exception {
        // 初始化classLoader
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class<?> clazz = classLoader.loadClass("com.xw.spring.framework.ioc.reflect.Car");

        // Car
        Constructor<?> carConstructor = clazz
                .getDeclaredConstructor(new Class[] { String.class, String.class, int.class });
        Car car = (Car) carConstructor.newInstance(new Object[] { "奔驰", "黑色", 220 });

        car.introduce();
    }

}
