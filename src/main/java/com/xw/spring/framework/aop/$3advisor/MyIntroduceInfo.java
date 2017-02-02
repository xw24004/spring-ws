package com.xw.spring.framework.aop.$3advisor;

import org.springframework.aop.support.IntroductionInfoSupport;

public class MyIntroduceInfo extends IntroductionInfoSupport {
    /**
     */
    private static final long serialVersionUID = 1L;

    public MyIntroduceInfo() {
        super();
        super.publishedInterfaces.add(com.xw.spring.framework.aop.$2advice.introduce.Monitorable.class);
    }
}
