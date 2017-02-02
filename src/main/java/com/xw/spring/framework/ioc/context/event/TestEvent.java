package com.xw.spring.framework.ioc.context.event;

import org.springframework.context.ApplicationEvent;

public class TestEvent extends ApplicationEvent {

	private static final long serialVersionUID = 1L;
	
	private String msg;
	
	public TestEvent(Object source) {
		super(source);
	}

	public TestEvent(Object source, String msg) {
		super(source);
		this.msg = msg;
	}
	
	public void print(){
		System.out.println(msg);
	}
	
}
