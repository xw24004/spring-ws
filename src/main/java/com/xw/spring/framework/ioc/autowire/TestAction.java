package com.xw.spring.framework.ioc.autowire;

public class TestAction {
	private TestBean testBean;
	private TestBean testBeanNew;

	public TestBean getTestBeanNew() {
		return testBeanNew;
	}

	public void setTestBeanNew(TestBean testBeanNew) {
		System.out.println("setTestBeanNew" + ":" + testBeanNew);
		this.testBeanNew = testBeanNew;
	}

	public void setTestBean(TestBean testBean) {
		System.out.println("setTestBean" + ":" + testBean);
		this.testBean = testBean;
	}

	public String execute() {
		testBeanNew.getCode();
		return "json";
	}

}
