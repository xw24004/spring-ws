package com.xw.spring.framework.ioc.autowire;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;


public class TestMain {
    DefaultListableBeanFactory beanFactory;

    @Before
    public void before() {
        String path = "com/xw/spring/framework/ioc/autowire/beans.xml";
        ClassPathResource resource = new ClassPathResource(path);
        beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions(resource);
    }

    @Test
    public void testName() {
    	TestAction testAction = beanFactory.getBean("testAction",TestAction.class);
    	System.out.println(testAction.execute());
    }
    
    @Test
    public void testType() {
    	TestAction testAction = beanFactory.getBean("testAction2",TestAction.class);
    	System.out.println(testAction.execute());
    }
}
