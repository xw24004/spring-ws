package com.xw.spring.framework.ioc2.$5factorybean;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    
    @Autowired
    public ApplicationContext factory = null;
    
    @Before
    public void before(){
        String path = "com/xw/spring/framework/ioc2/$5factorybean/beans.xml";
        factory = new ClassPathXmlApplicationContext(path);
    }
    
    @Test
    public void testCarFactoryBean(){
       Car car_1 = factory.getBean("car1",Car.class);
       Car car_2 = factory.getBean("car1",Car.class);
       Assert.assertNotNull(car_1);
       Assert.assertSame(car_1,car_2);
       System.out.println(car_1);
    }
}
