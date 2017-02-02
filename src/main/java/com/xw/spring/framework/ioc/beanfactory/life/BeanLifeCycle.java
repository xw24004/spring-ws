package com.xw.spring.framework.ioc.beanfactory.life;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.xw.spring.framework.ioc.Car;


public class BeanLifeCycle {
	private static void LifeCycleInBeanFactory() {
		Resource res = new ClassPathResource("com/xw/spring/framework/ioc/beanfactory/life/beans.xml");
		XmlBeanFactory bf = new XmlBeanFactory(res);
		(new MyBeanFactoryPostProcessor()).postProcessBeanFactory((XmlBeanFactory) bf);
		// InstantiationAwareBeanPostProcessor
		((ConfigurableBeanFactory) bf).addBeanPostProcessor(new MyInstantiationAwareBeanPostProcessor());
		// BeanPostProcessor
		((ConfigurableBeanFactory) bf).addBeanPostProcessor(new MyBeanPostProcessor());
		Car car1 = (Car) bf.getBean("car");
		car1.introduce();
		car1.setColor("红色");
		Car car2 = bf.getBean("car", Car.class);
		car2.introduce();
		((XmlBeanFactory) bf).destroySingletons();
	}

	public static void main(String[] args) {
		LifeCycleInBeanFactory();
	}
}
