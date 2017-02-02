package com.xw.spring.framework.aop.$0biaoqian;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * 实现BeanDefinitionParser接口，用来解析XSD文件中的定义和组件定义。
 * @author 14082455
 *
 */

public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	// Element对应的类，这里是User.java
	protected Class getBeanClass(Element element) {
		return User.class;
	}

	@Override
	// 从Element中提取对应的元素
	protected void doParse(Element element, BeanDefinitionBuilder bean) {
		String userName = element.getAttribute("userName");
		String email = element.getAttribute("email");
		//
		if (StringUtils.hasText(userName)) {
			bean.addPropertyValue("userName", userName);
		}
		if (StringUtils.hasText(email)) {
			bean.addPropertyValue("email", email);
		}
	}
}
