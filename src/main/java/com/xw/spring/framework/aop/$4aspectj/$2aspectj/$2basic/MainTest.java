package com.xw.spring.framework.aop.$4aspectj.$2aspectj.$2basic;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xw.spring.framework.aop.$4aspectj.$2aspectj.Waiter;
import com.xw.spring.framework.aop.$4aspectj.$2aspectj.Seller;

public class MainTest {

    @SuppressWarnings("resource")
    @Test
    public void aspectConfigTest() {
        String configPath = "com/xw/spring/framework/aop/$4aspectj/$2aspectj/$2basic/beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
        Waiter waiter = (Waiter) ctx.getBean("waiter");
        waiter.greetTo("John");
        Seller seller = (Seller) waiter;
        seller.server("John", "大宝剑");
    }

}
