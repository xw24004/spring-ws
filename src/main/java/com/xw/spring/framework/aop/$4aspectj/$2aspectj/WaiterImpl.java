package com.xw.spring.framework.aop.$4aspectj.$2aspectj;

public class WaiterImpl implements Waiter {

    public WaiterImpl() {
		super();
		System.out.println(this.getClass().getName() + "constructor Created!!!");
	}

	@Override
    public void greetTo(String name) {
        System.out.println("greatTo" + name + "!");
    }

    @Override
    public void serveTo(String name) {
        System.out.println("serveTo " + name + "!");
    }
}
