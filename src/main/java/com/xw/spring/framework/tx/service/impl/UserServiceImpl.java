package com.xw.spring.framework.tx.service.impl;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.xw.spring.framework.tx.bean.User;
import com.xw.spring.framework.tx.service.UserService;

public class UserServiceImpl implements UserService {

    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void save(User user) throws Exception {
        String sql = "insert into user(name,age,sex) values(?,?,?)";
        jdbcTemplate.update(sql, new Object[] { user.getName(), user.getAge(), user.getSex() },
                new Integer[] { java.sql.Types.VARCHAR, java.sql.Types.INTEGER, java.sql.Types.INTEGER });

        // 测试事物
//        throw new Exception();
    }

}
