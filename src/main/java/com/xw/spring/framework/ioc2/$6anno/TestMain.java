package com.xw.spring.framework.ioc2.$6anno;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    ApplicationContext ctx = null;

    @Before
    public void before() {
        ctx = new ClassPathXmlApplicationContext("com/xw/spring/framework/ioc2/$6anno/beans.xml");
    }

    @Test
    public void test() {
        LogonService logonService = ctx.getBean(LogonService.class);
        logonService.initMethod1();
        logonService.getUserId();
    }

}
