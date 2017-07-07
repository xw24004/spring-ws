package com.xw.spring.framework.aop.$1.proxy;

import java.lang.reflect.Field;

import org.junit.Test;

public class TestMain {

	@Test
	public void testJDK() throws Exception {
		ForumService target = (ForumService) new PerformaceHandler().bind(new ForumServiceImpl());
		target.reMoveTopic(10);
		target.reMoveForum(100);
		System.out.println(getTargetObj(target));
	}

	@Test
	public void testCGLIB() {
		CglibProxy proxy = new CglibProxy();
		ForumService target = (ForumService) proxy.bind(ForumServiceImpl.class);
		target.reMoveTopic(10);
		target.reMoveForum(100);
	}

	public String getTargetObj(Object obj) throws Exception {
		Field h = obj.getClass().getSuperclass().getDeclaredField("h");
		h.setAccessible(true);
		return ((PerformaceHandler) h.get(obj)).getTarget().getClass().getSimpleName();
	}
}
