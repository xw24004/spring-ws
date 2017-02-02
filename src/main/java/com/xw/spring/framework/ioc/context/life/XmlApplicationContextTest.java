package com.xw.spring.framework.ioc.context.life;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xw.spring.framework.ioc.Car;


public class XmlApplicationContextTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/xw/spring/framework/ioc/context/life/*.xml");
		Car car1 = ctx.getBean("car",Car.class);
		System.out.println(car1);
//		ctx = new FileSystemXmlApplicationContext("D:/masterSpring/chapter3/src/com/baobaotao/context/*.xml");
//		Car car2 = ctx.getBean("car",Car.class);
	}
}
