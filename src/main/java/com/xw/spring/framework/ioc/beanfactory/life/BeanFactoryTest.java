package com.xw.spring.framework.ioc.beanfactory.life;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import com.xw.spring.framework.ioc.Car;


public class BeanFactoryTest {
	public static void main(String[] args) throws Throwable{
	   ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
	   Resource res = resolver.getResource("classpath:com/xw/spring/framework/ioc/beanfactory/life/beans.xml");
	   System.out.println(res.getURL());
       BeanFactory bf = new XmlBeanFactory(res);
       System.out.println("init BeanFactory.");
       
       Car car = bf.getBean("car",Car.class);
       System.out.println("car bean is ready for use!");
       car.introduce();
	}
}
