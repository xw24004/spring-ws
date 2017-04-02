package com.xw.spring.framework.ioc2.$7context.$4event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xw.spring.framework.ioc.context.event.TestEvent;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/xw/spring/framework/ioc2/$7context/$4event/beans.xml");
        TestEvent event = new TestEvent("hello", "msg");
        context.publishEvent(event);
        event = new TestEvent("hello2", "msg2");
        context.publishEvent(event);
    }
}
