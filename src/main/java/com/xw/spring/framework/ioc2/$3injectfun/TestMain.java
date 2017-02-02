package com.xw.spring.framework.ioc2.$3injectfun;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xw.spring.framework.ioc2.$3injectfun.Car;

public class TestMain {
    public ApplicationContext factory = null;
    private static String[] CONFIG_FILES = { "com/xw/spring/framework/ioc2/$3injectfun/beans.xml" };

    @Before
    public void test() {
        factory = new ClassPathXmlApplicationContext(CONFIG_FILES);
    }
    
    @Test
    public void testCar1(){
       Car car = factory.getBean("car",Car.class);
       System.out.println(car);
    }
    
    @Test
    public void testLookUp(){
        MagicBoss magicBoss = factory.getBean("magicBoss",MagicBoss.class);
       System.out.println(magicBoss.getCar());
    }
}   
