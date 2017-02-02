package com.xw.spring.framework.ioc.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

public class CarReflectTest {

    @Test
    public void initDefaultConstruct() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
            InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        // 1.װ��classLoader
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class<?> clazz = classLoader.loadClass("com.xw.spring.framework.ioc.reflect.Car");

        // 2.��ʼ��
        Constructor<?> carConstructor = clazz.getDeclaredConstructor((Class[]) null);
        Car car = (Car) carConstructor.newInstance();

        // 3.����
        Method setBrand = clazz.getMethod("setBrand", String.class);
        setBrand.invoke(car, "����");
        Method setColor = clazz.getMethod("setColor", String.class);
        setColor.invoke(car, "��ɫ");
        Method setMaxSpeed = clazz.getMethod("setMaxSpeed", int.class);
        setMaxSpeed.invoke(car, 200);
        car.introduce();
    }

    @Test
    public void initConstructorByParams() throws Exception {
        // ��ʼ��classLoader
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class<?> clazz = classLoader.loadClass("com.xw.spring.framework.ioc.reflect.Car");

        // Car
        Constructor<?> carConstructor = clazz
                .getDeclaredConstructor(new Class[] { String.class, String.class, int.class });
        Car car = (Car) carConstructor.newInstance(new Object[] { "����", "��ɫ", 220 });

        car.introduce();
    }

}
