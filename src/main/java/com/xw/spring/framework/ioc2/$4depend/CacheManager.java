package com.xw.spring.framework.ioc2.$4depend;

import java.util.Timer;
import java.util.TimerTask;

public class CacheManager {
   public CacheManager(){
	   Timer timer = new Timer();
	   TimerTask cacheTask = new CacheTask();
	   timer.schedule(cacheTask,0,SystemSettings.REFRESH_CYCLE*1000);  
   }
}
