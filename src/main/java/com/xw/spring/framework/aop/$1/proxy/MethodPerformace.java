package com.xw.spring.framework.aop.$1.proxy;

public class MethodPerformace {
    long start;
    long end;
    String serviceName;

    public MethodPerformace(String serviceName) {
        reSet(serviceName);
    }

    public void printInfo() {
        end = System.currentTimeMillis();
        System.out.println("serviceName=" + serviceName + "一共花费了 " + (end - start) + " MS");
    }

    public void reSet(String serviceName) {
        start = System.currentTimeMillis();
        this.serviceName = serviceName;
    }

}
