package com.xw.spring.framework.aop.$1.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;


public class MyInvocationHandler<T> implements InvocationHandler {

    private Object target;

    public MyInvocationHandler(Object target) {
        super();
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是代理，帮你盛饭!!!");
        Object object = method.invoke(target, args);
        System.out.println("我是代理，帮你洗碗!!!");
        return object;
    }

    @SuppressWarnings("unchecked")
    public T getProxy() {
        return (T) Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

//    public static void showProxyClass() {
//        String path = "./$Proxy0.class";
//        byte[] classFile = ProxyGenerator.generateProxyClass("$Proxy0", UserServiceImpl.class.getInterfaces());
//        FileOutputStream out = null;
//        try {
//            out = new FileOutputStream(path);
//            out.write(classFile);
//            out.flush();
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                out.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
    
    public static void main(String[] args) {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true"); 
//        System.out.println(Proxy.getProxyClass(UserService.class.getClassLoader(), UserService.class));  
//        HashMap<String,String> map = new HashMap<>();
//        map.put("1", "2");
        
        UserService userService = new MyInvocationHandler<UserService>(new UserServiceImpl()).getProxy();
//        showProxyClass();
        
        userService.eat();
        System.out.println("======================>");
        QueryService query = new MyInvocationHandler<QueryService>(new QueryServiceImpl()).getProxy();
        query.query();
    }

}
