package com.xw.spring.framework.aop.$4aspectj.$2aspectj.$3schema;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.xw.spring.framework.aop.$4aspectj.$2aspectj.*;

public class TestMain {

    @Test
    public void test() {
        String configPath = "com/xw/spring/framework/aop/$4aspectj/$2aspectj/$3schema/beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
        Waiter naiveWaiter = (Waiter) ctx.getBean("naiveWaiter");
        Waiter naughtyWaiter = (Waiter) ctx.getBean("naughtyWaiter");
        Seller seller = (Seller) ctx.getBean("seller");
        // naiveWaiter.greetTo("John");
        // naughtyWaiter.greetTo("Tom");

        // 后置增强
        // ((SmartSeller)seller).sell("Beer","John");

        // 环境增强
        // naiveWaiter.serveTo("John");

        // 抛出异常增强
        // ((SmartSeller)seller).checkBill(1);

        // final增强
        // naiveWaiter.greetTo("John");

        // 引入增强
        // ((Seller)naiveWaiter).sell("Beer","John");
        // ((NaiveWaiter)naiveWaiter).smile("John", 2);

        // advisor
        naiveWaiter.greetTo("John");
    }
}
