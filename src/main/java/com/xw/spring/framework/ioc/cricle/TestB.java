package com.xw.spring.framework.ioc.cricle;

public class TestB {
	
	
	public TestB() {
		System.out.println("调用了B的构造函数");
	}

	private TestA testA;

	
	
	public void b() {
		testA.a();
	}

	public TestA getTestA() {
		return testA;
	}

	public void setTestA(TestA testA) {
		System.out.println("B中setTestC");
		this.testA = testA;
	}
}
