package com.xw.spring.framework.aop.$2advice;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class GreetingInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Method method = invocation.getMethod();
        Object args[] = invocation.getArguments();
        System.out.println(method + ",你好" + args[0]);
        invocation.proceed();
        System.out.println(method + ",再见" + args[0]);
        return null;
    }

}
