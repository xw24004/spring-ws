package com.xw.spring.framework.ioc2.$6anno;

import org.springframework.stereotype.Component;

@Component("userDao")
public class UserDao {
    public String getUserId() {
        return "12315";
    }
}
