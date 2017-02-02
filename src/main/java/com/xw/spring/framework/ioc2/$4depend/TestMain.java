package com.xw.spring.framework.ioc2.$4depend;


import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public ApplicationContext factory = null;

    private static String[] CONFIG_FILES = { "com/xw/spring/framework/ioc2/$4depend/beans.xml" };

    @Before
    public void setUp() throws Exception {
        factory = new ClassPathXmlApplicationContext(CONFIG_FILES);

    }

    @Test
    public void testInheritTag() {
        Car car3 = (Car) factory.getBean("car3");
        Car car4 = (Car) factory.getBean("car4");
        System.out.println(car3);
        System.out.println(car4);
    }

    @Test
    public void testReferenceTag() {
        Boss boss = (Boss) factory.getBean("boss");
        System.out.println(boss);
    }
}
