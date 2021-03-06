package com.xw.spring.framework.ioc.context;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarApplicationContextTest {
    ClassPathXmlApplicationContext context;

    @Before
    public void before() {
        // 这里模仿 XmlBeanFactory,XmlBeanFactory已经不推荐使用，因为final XmlBeanDefinitionReader 为私有的。
        String path = "com/xw/spring/framework/ioc/beanfactory/beans.xml";
        context = new ClassPathXmlApplicationContext(path);
    }
    
    @Test
    public void test1(){
    	context.getBean("car");
    }
}
