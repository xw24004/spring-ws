package com.xw.spring.framework.tx.simple.service.impl;

import com.xw.spring.framework.tx.simple.bean.User;
import com.xw.spring.framework.tx.simple.dao.AccountDao;
import com.xw.spring.framework.tx.simple.service.AccountService;
import org.springframework.transaction.support.TransactionTemplate;

public class AccountServiceImpl3 implements AccountService {

    private AccountDao accountDao;
    private TransactionTemplate transactionTemplate;


    @Override
    public void save(User user) throws Exception {

    }

    @Override
    public void transfer(final String out, final String in, final Double money) {
        accountDao.inMoney(in, money);
        int i = 1 / 0;
        System.out.printf("i=" + i);
        accountDao.outMoney(out, money);
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }
}
