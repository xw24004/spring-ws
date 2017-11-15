package com.xw.spring.framework.tx.simple;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xw.spring.framework.tx.simple.service.AccountService;

/**
 * Created by xuwei on 2017-11-15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringTest {
    @Resource(name = "accountService")
    private AccountService accountService;

    @Test
    public void test() {
        accountService.transfer("aaa", "bbb", 200D);
    }
}
