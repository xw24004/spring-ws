package com.xw.spring.framework.ioc2.$2collect;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {

    public ApplicationContext factory = null;
    private static String[] CONFIG_FILES = { "com/xw/spring/framework/ioc2/$2collect/beans.xml" };

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
    public void testBoss(){
       Boss boss1 = factory.getBean("boss1",Boss.class);
       System.out.println(boss1);
       
       Boss boss2 = factory.getBean("boss2",Boss.class);
       System.out.println(boss2);
       
       System.out.println(boss1.getCar() == boss2.getCar());
       
//       System.out.println("parentBoss=====>");
//       Boss parentBoss = factory.getBean("parentBoss",Boss.class);
//       System.out.println(parentBoss);
       
       System.out.println("childBoss=====>");
       Boss childBoss = factory.getBean("childBoss",Boss.class);
       System.out.println(childBoss);
    }
    
    @Test
    public void testCascadeAttr(){
        SportsCar sportsCar = (SportsCar)factory.getBean("sportsCar");
        System.out.println(sportsCar.getBrand());
    }
}
