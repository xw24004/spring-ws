package com.xw.spring.framework.aop.$2advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class GreetingBeforeAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("method=" + method.getName() + ",你好," + args[0] + "!");
    }

}
