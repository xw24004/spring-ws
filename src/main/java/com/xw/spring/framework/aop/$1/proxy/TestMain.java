package com.xw.spring.framework.aop.$1.proxy;

import org.junit.Test;

public class TestMain {

    @Test
    public void testJDK() {
        ForumService target = (ForumService) new PerformaceHandler().bind(new ForumServiceImpl());
        target.reMoveTopic(10);
        target.reMoveForum(100);
    }
    
    @Test
    public void testCGLIB() {
        CglibProxy proxy = new CglibProxy();
        ForumService target = (ForumService) proxy.bind(ForumServiceImpl.class);
        target.reMoveTopic(10);
        target.reMoveForum(100);
    }
}
