package com.j;

import java.util.Calendar;
import java.util.Date;

public class Interval {
	
	 public static Long getWaitTimeToNextInterval(int interval, long offset) {

	        long currentDateTime = System.currentTimeMillis();
	        Calendar calendar = Calendar.getInstance();

	        calendar.setTime(new Date(currentDateTime));
	        int unroundedMinutes = calendar.get(Calendar.MINUTE);
	        int mod = unroundedMinutes % interval;
	        calendar.add(Calendar.MINUTE, interval-mod);

	        long wait = calendar.getTimeInMillis() - currentDateTime;
	        if(offset != 0L) {
	            wait += offset;
	        }

	        return wait;
	    }
	 
	 
	 public static void main(String[] args) {
		 long timeout = getWaitTimeToNextInterval(15, 60000L);
		 
		 System.out.println(timeout);
	}

}
