package com.xw.spring.framework.aop.$3advisor;

public class Waiter {

	public void greetTo(String name) {
		System.out.println("waiter greet to "+name+"...");
	}
	
	public void serveTo(String name){
		System.out.println("waiter serving "+name+"...");
	}
}
