package com.xw.spring.framework.ioc2.$4depend;

import java.util.TimerTask;

public class CacheTask extends TimerTask {
	public void run() {
		System.out.println("doing clean cache");
	}

}
