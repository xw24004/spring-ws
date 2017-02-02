package com.xw.spring.framework.aop.$3advisor.autoproxy;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xw.spring.framework.aop.$3advisor.Waiter;
;public class TestMain {

    String configPath = "com/xw/spring/framework/aop/$3advisor/autoproxy/beans.xml";
    ApplicationContext ctx;

    @Before
    public void before() {
        ctx = new ClassPathXmlApplicationContext(configPath);
    }

    @Test
    // 1.静态方法
    public void testStaticMethodAdvisor() {
        Waiter waiter = (Waiter) ctx.getBean("waiter");
        waiter.serveTo("Peter");
        waiter.greetTo("Peter");
    }
}
