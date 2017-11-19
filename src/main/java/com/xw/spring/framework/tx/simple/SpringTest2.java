package com.xw.spring.framework.tx.simple;

import com.xw.spring.framework.tx.simple.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:com/xw/spring/framework/tx/simple/applicationContext2.xml")
public class SpringTest2 {
    @Resource(name = "accountService")
    private AccountService accountService;

    @Test
    public void test() {
        accountService.transfer("aaa", "bbb", 200D);
    }
}
