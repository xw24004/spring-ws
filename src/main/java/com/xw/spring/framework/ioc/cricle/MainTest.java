package com.xw.spring.framework.ioc.cricle;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;


public class MainTest {
    DefaultListableBeanFactory beanFactory;

    @Before
    public void before() {
        // 这里模仿 XmlBeanFactory,XmlBeanFactory已经不推荐使用，因为final XmlBeanDefinitionReader 为私有的。
        String path = "com/xw/spring/framework/ioc/cricle/bean.xml";
        ClassPathResource resource = new ClassPathResource(path);
        beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions(resource);
    }

    @Test
    public void test1() {
    	// Is there an unresolvable circular reference
        TestA testa = (TestA) beanFactory.getBean("testA");
        System.out.println(testa);
    }
}
