package com.xw.spring.framework.aop.$4aspectj.$2aspectj.$2basic;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

import com.xw.spring.framework.aop.$4aspectj.$2aspectj.*;

@Aspect
public class EnableSellerAspect {
    // value 为此增加实现，defaultImpl默认使用实现
    @DeclareParents(value = "com.xw.spring.framework.aop.$4aspectj.$2aspectj.WaiterImpl", defaultImpl = SellerImpl.class)
    public Seller seller;
}
