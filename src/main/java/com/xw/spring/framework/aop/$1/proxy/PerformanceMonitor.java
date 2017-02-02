package com.xw.spring.framework.aop.$1.proxy;

public class PerformanceMonitor {
    private static ThreadLocal<MethodPerformace> myThreadLocal = new ThreadLocal<>();

    public static void begin(String method) {
        System.out.println("begin monitor " + method);
        MethodPerformace methodPerformace = myThreadLocal.get();
        if (methodPerformace == null) {
            methodPerformace = new MethodPerformace(method);
            myThreadLocal.set(methodPerformace);
        } else {
            methodPerformace.reSet(method);
        }
    }

    public static void end() {
        MethodPerformace methodPerformace = myThreadLocal.get();
        if (methodPerformace == null) {
            System.err.println("methodPerformace == null");
        }else{
            methodPerformace.printInfo();
        }
    }

}
