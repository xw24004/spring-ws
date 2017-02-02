package com.xw.spring.framework.aop.$4aspectj.$2aspectj.$1simple;

import org.junit.Test;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xw.spring.framework.aop.$4aspectj.$2aspectj.*;

import com.xw.spring.framework.aop.$4aspectj.$2aspectj.Waiter;

public class AspectJProxyTest {

    @Test
    public void aspectJProxyTest() {
        Waiter target = new WaiterImpl();
        AspectJProxyFactory factory = new AspectJProxyFactory();
        factory.setTarget(target);
        factory.addAspect(PreGreetingAspect.class);
        Waiter proxy = factory.getProxy();
        proxy.greetTo("John");
        proxy.serveTo("John");
    }

    @SuppressWarnings("resource")
    @Test
    public void aspectConfigTest() {
        String configPath = "com/xw/spring/framework/aop/$4aspectj/$2aspectj/$1simple/beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
        Waiter waiter = (Waiter) ctx.getBean("waiter");
        waiter.greetTo("John");
        
        System.out.println("========");
        
        waiter.serveTo("John");
        waiter.toString();
    }

}
