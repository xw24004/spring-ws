package com.xw.spring.framework.tx.simple.dao;

public interface AccountDao {
    
    /**
     * @param out 转出的账号
     * @param monmey 转出的
     */
    public void outMoney(String out, Double monmey);
    
    /**
     * @param in 转出的账号
     * @param monmey 转出的
     */
    public void inMoney(String in, Double monmey);
}
