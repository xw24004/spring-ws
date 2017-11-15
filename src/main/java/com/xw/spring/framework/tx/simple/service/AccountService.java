package com.xw.spring.framework.tx.simple.service;

import com.xw.spring.framework.tx.simple.bean.User;

public interface AccountService {
    public void save(User user) throws Exception;

    /**
     * 转账
     * 
     * @param out 转出账号
     * @param in 转入账号
     * @param money 金额
     */
    public void transfer(String out, String in, Double money);
}
