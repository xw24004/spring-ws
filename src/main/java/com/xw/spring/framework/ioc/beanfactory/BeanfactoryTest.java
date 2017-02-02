package com.xw.spring.framework.ioc.beanfactory;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import com.xw.spring.framework.ioc.Car;

public class BeanfactoryTest {

    DefaultListableBeanFactory beanFactory;

    @Before
    public void before() {
        // 这里模仿 XmlBeanFactory,XmlBeanFactory已经不推荐使用，因为final XmlBeanDefinitionReader 为私有的。
        String path = "com/xw/spring/framework/ioc/beanfactory/beans.xml";
        //String path = "com/xw/spring/framework/ioc2/$1simple/beans.xml";
        ClassPathResource resource = new ClassPathResource(path);
        beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions(resource);
    }

    @Test
    public void test1() {
        //beanFactory.containsBean("car");
     	Car car = beanFactory.getBean("car",Car.class);
 //       Car car = beanFactory.getBean("car",Car.class,"brand","name");
//        car.myDestory();
//        Car car2 = (Car) beanFactory.getBean("car");
//        car2.myDestory();
    }
    
    @Test
    public void testFactoryBean(){
    	com.xw.spring.framework.ioc2.$1simple.Car car = beanFactory.getBean("car2", com.xw.spring.framework.ioc2.$1simple.Car.class);
        System.out.println(car);
    }
    
    @Test
    public void test2() {
        Car car = (Car) beanFactory.getBean("car2");
    }
    
}
