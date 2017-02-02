package com.xw.spring.framework.aop.$4aspectj.$1annotation;

import java.lang.reflect.Method;

public class TestMain {
    public static void main(String[] args) {
        Class<?> clazz = ForumService.class;
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            NeedTest nt = method.getAnnotation(NeedTest.class);
            if (nt != null) {
                if (nt.value()) {
                    System.out.println(method.getName() + "需要测试");
                } else {
                    System.out.println(method.getName() + "不需要需要测试");
                }
            }
        } // end for

    }
}
