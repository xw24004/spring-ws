package com.xw.spring.framework.ioc2.$7context.$4event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

import com.xw.spring.framework.ioc.context.event.TestEvent;

public class TestListener implements ApplicationListener<ApplicationEvent> {

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof TestEvent) {
            TestEvent testEvent = (TestEvent) event;
            System.out.println(testEvent.toString());
        }
    }

}
