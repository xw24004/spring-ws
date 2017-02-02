package com.xw.spring.framework.aop.$3advisor;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.xw.spring.framework.aop.$2advice.introduce.*
;public class TestMain {

    String configPath = "com/xw/spring/framework/aop/$3advisor/beans.xml";
    ApplicationContext ctx;

    @Before
    public void before() {
        ctx = new ClassPathXmlApplicationContext(configPath);
    }

    @Test
    // 1.静态方法
    public void testStaticMethodAdvisor() {
        // 1.此处只匹配 Waiter#greetTo(),参考#{@link GreetingAdvisor}
        Waiter waiter = (Waiter) ctx.getBean("waiter");
        Seller seller = (Seller) ctx.getBean("seller");
        waiter.greetTo("John");
        waiter.serveTo("John");
        seller.greetTo("John");
    }

    @Test
    // 2.正则表达式
    public void testRegexpAdvisor() {
        Waiter waiter = (Waiter) ctx.getBean("waiter1");
        waiter.greetTo("John");
        waiter.serveTo("John");
    }

    @Test
    // 3.动态方法，目前不推荐
    public void testDynamicAdvisor() {
        Waiter waiter = (Waiter) ctx.getBean("waiter2");
        waiter.serveTo("Peter");
        waiter.greetTo("Peter");
        waiter.serveTo("Peter");
        waiter.greetTo("John");
    }

    @Test
    // 4.流程控制
    public void testControlFlowAdvisor() {
        Waiter waiter = (Waiter) ctx.getBean("waiter3");
        WaiterDelegate wd = new WaiterDelegate();
        wd.setWaiter(waiter);
        // 普通
        waiter.serveTo("Peter");
        waiter.greetTo("Peter");
        System.out.println("==========>");
        // 增强
        wd.service("Peter");
    }

    @Test
    // 4.复合切面
    public void testComposableAdvisor() {
        Waiter waiter = (Waiter) ctx.getBean("waiter4");
        WaiterDelegate wd = new WaiterDelegate();
        wd.setWaiter(waiter);
        // 普通
        waiter.serveTo("Peter");
        waiter.greetTo("Peter");
        System.out.println("==========>");
        // 增强,这里仅有greetTo方法被增强
        wd.service("Peter");
    }
    
    @Test
    // 4.复合切面
    public void testIntroduceAdvisor() {
        ForumService forumService = (ForumService)ctx.getBean("forumService");
        forumService.removeForum(10);
        Monitorable moniterable = (Monitorable)forumService;
        moniterable.setMonitorActive(true);
        forumService.removeForum(10);
    }
}
