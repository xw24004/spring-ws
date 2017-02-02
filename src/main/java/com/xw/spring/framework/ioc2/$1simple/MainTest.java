package com.xw.spring.framework.ioc2.$1simple;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;

public class MainTest extends TestCase {

    public ApplicationContext factory = null;
    private static String[] CONFIG_FILES = { "com/xw/spring/framework/ioc2/$1simple/beans.xml" };

    @Override
    public void setUp() {
        factory = new ClassPathXmlApplicationContext(CONFIG_FILES);
    }

    @Test
    public void testCar() {
        Car car = factory.getBean("car", Car.class);
        System.out.println(car.getName());
        assertNotNull(car);
    }
    
    @Test
    public void testBoss() {
        Boss boss = factory.getBean("boss", Boss.class);
        System.out.println(boss.getName() + " " + boss.getCar().getName());
        assertNotNull(boss);
    }
    
    @Test
    public void testFactory() {
        Car car = factory.getBean("car2", Car.class);
        System.out.println(car);
        assertNotNull(car);
    }
    
    @Test
    public void testStaticFactory() {
        Car car = factory.getBean("car3", Car.class);
        System.out.println(car);
        assertNotNull(car);
    }

}
