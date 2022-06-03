package com.gmail.kukaruka52;

import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {

		Calendar cdNow = Calendar.getInstance();
		Calendar cdMonthAgo = Calendar.getInstance();
		int month = cdNow.get(Calendar.MONTH)-1;
		cdMonthAgo.set(Calendar.MONTH, month);
		
		
		Date date = cdNow.getTime();
		
		Date date2 = cdMonthAgo.getTime();
		
		
		System.out.println(date.getTime()-date2.getTime());
		
	}
		

}