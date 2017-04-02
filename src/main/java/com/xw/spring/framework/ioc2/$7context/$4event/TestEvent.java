package com.xw.spring.framework.ioc2.$7context.$4event;

import org.springframework.context.ApplicationEvent;

public class TestEvent extends ApplicationEvent {

    private static final long serialVersionUID = 1L;

    public String msg;

    public TestEvent(Object source) {
        super(source);
        System.out.println("TestEvent(Object source)"+source);
    }

    public TestEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
        System.out.println("TestEvent(Object source, String msg)"+source);
    }

    @Override
    public String toString() {
        return "TestEvent [msg=" + msg + "]";
    }

}
