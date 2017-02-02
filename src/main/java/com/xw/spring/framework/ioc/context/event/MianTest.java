package com.xw.spring.framework.ioc.context.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MianTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/xw/spring/framework/ioc/context/event/beans.xml");
		TestEvent testEvent = new TestEvent("hello", "msg................");
		for (int i = 0; i < 100; i++) {
			context.publishEvent(testEvent);
		}
	}
}
