package com.xw.spring.framework.aop.$0biaoqian;

import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
  
/**
 * 扩展spring自定义标签配置大致需要以下几个步骤：
 * 1.定义一个需要扩展的组件，如这里的User.java
 * 2.定义一个xsd文件，如这里的spring-test.xsd
 * 3. 创建一个文件，实现BeanDefinitionParser接口，我这里是继承了AbstractSingleBeanDefinitionParser，
 * 用来解析xsd文件中的定义和组件定义
 * 4.创建一个Handler文件，扩展NamespaceHandlerSuppor，目的是将组件注册到spring容器。
 * 5.编写spring.handler和spring.schemas文件
 * @author 14082455
 *
 */
public class MainTest {  
  
    public static void main(String[] args) {  
        @SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/xw/spring/framework/aop/$0biaoqian/bean.xml");  
        User user = (User) ac.getBean("testBean");  
        System.out.println(user.getUserName());  
    }
  
}