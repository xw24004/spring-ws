package com.xw.spring.framework.aop.$4aspectj.$2aspectj.$1simple;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class PreGreetingAspect {
	
	public PreGreetingAspect(){
		System.out.println(this.getClass().getName() + "Constructor created !!!");
	}
	
    @Before("execution(* greetTo(..))")
    public void beforeGreeting() {
        System.out.println("greetTo() How are you");
    }
    
    @After("execution(* greetTo(..))")
    public void afterGreeting() {
        System.out.println("greetTo() 再见您那。");
    }
}
