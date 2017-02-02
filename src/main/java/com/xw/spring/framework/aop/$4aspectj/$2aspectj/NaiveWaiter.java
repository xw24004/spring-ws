package com.xw.spring.framework.aop.$4aspectj.$2aspectj;
import com.xw.spring.framework.aop.$4aspectj.$1annotation.*;

@Monitorable
public class NaiveWaiter implements Waiter {
	public void greetTo(String clientName) {
		System.out.println("NaiveWaiter:greet to "+clientName+"...");
	}	
	@NeedTest
	public void serveTo(String clientName){
		System.out.println("NaiveWaiter:serving "+clientName+"...");
	}
	public void smile(String clientName,int times){
		System.out.println("NaiveWaiter:smile to  "+clientName+ times+"times...");
	}	
}
