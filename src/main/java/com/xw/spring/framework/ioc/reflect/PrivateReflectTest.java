package com.xw.spring.framework.ioc.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

public class PrivateReflectTest {

    @Test
    public void test() throws Exception {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class<?> clazz = classLoader.loadClass("com.xw.spring.framework.ioc.reflect.PrivateCar");

        Constructor<?> cons = clazz.getDeclaredConstructor((Class[]) null);
        PrivateCar car = (PrivateCar) cons.newInstance();

        Field brand = clazz.getDeclaredField("brand");
        brand.setAccessible(true);
        brand.set(car, "°ÂµÏ");

        Method method = clazz.getDeclaredMethod("toPrint", (Class[]) null);
        method.setAccessible(true);
        method.invoke(car, (Object[]) null);
    }
}
