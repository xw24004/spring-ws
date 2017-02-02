package com.xw.spring.framework.aop.$2advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.junit.Test;
import org.springframework.aop.AfterAdvice;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

    @Test
    public void beforeAdviceTest() {
        Waiter target = new WaiterImpl();
        BeforeAdvice advice = new GreetingBeforeAdvice();
        ProxyFactory proxyFactory = new ProxyFactory();

        proxyFactory.setInterfaces(target.getClass().getInterfaces());
        proxyFactory.setOptimize(true);
        proxyFactory.setTarget(target);
        proxyFactory.addAdvice(advice);

        Waiter proxy = (Waiter) proxyFactory.getProxy();
        proxy.GreatTo("徐先生");
    }

    @Test
    public void afterAdviceTest() {
        Waiter target = new WaiterImpl();
        AfterAdvice advice = new GreetingAfterAdvice();
        ProxyFactory proxyFactory = new ProxyFactory();

        proxyFactory.setInterfaces(target.getClass().getInterfaces());
        proxyFactory.setOptimize(true);
        proxyFactory.setTarget(target);
        proxyFactory.addAdvice(advice);

        Waiter proxy = (Waiter) proxyFactory.getProxy();
        proxy.GreatTo("徐先生");
    }

    @Test
    public void greetingInterceptorTest() {
        Waiter target = new WaiterImpl();
        MethodInterceptor advice = new GreetingInterceptor();
        ProxyFactory proxyFactory = new ProxyFactory();

        proxyFactory.setInterfaces(target.getClass().getInterfaces());
        proxyFactory.setOptimize(true);
        proxyFactory.setTarget(target);
        proxyFactory.addAdvice(advice);

        Waiter proxy = (Waiter) proxyFactory.getProxy();
        proxy.GreatTo("徐先生");
    }

    @Test
    public void ProxyFactoryBeanTest() throws ClassNotFoundException {
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/xw/spring/framework/aop/$2advice/beans.xml");
        Waiter waiter = context.getBean("waiter", Waiter.class);
        waiter.GreatTo("张先生");
    }

    @Test
    public void ProxyFactoryThrowBeanTest() throws ClassNotFoundException {
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/xw/spring/framework/aop/$2advice/beans.xml");
        ForumService forumService = context.getBean("forumService", ForumService.class);
        forumService.removeForum(1);

        Forum forum = new Forum();
        forum.setForumId(2);
        try {
            forumService.updateForum(forum);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
