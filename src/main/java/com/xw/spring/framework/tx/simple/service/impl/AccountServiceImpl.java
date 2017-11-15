package com.xw.spring.framework.tx.simple.service.impl;

import com.xw.spring.framework.tx.simple.dao.AccountDao;

import com.xw.spring.framework.tx.simple.bean.User;
import com.xw.spring.framework.tx.simple.service.AccountService;

public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    @Override
    public void save(User user) throws Exception {

    }

    @Override
    public void transfer(String out, String in, Double money) {
        accountDao.inMoney(in, money);
        accountDao.outMoney(out, money);
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

}
