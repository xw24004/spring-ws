package com.xw.spring.framework.mybatis.mapper;

import com.xw.spring.framework.mybatis.bean.User;

public interface UserMapper {
    public void insert(User user);

    public void selectUserById(Integer id);
}
