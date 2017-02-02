package com.xw.spring.framework.aop.$4aspectj.$2aspectj;

public class SellerImpl implements Seller {

    @Override
    public void server(String clientName, String serverName) {
        System.out.println("为" + clientName + "提供" + serverName + "服务。");
    }

}
