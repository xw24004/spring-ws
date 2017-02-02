package com.xw.spring.framework.ioc.cricle;

public class TestA {
	
	public TestA() {
		System.out.println("调用了A的构造函数");
	}

	private TestB testB;

	public void a() {
		testB.b();
	}

	public TestB getTestB() {
		return testB;
	}

	public void setTestB(TestB testB) {
		System.out.println("A中setTestB");
		this.testB = testB;
	}

}
