package com.dailyTask.utility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class FormatDate {


	public static Date convertDate(String date) {
		
		//date= date.replace("-", "/");

		
		
		Date toDate = null;
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		
			
			try {
				toDate = formatter.parse(date);
			} catch (java.text.ParseException e) {
				
				e.printStackTrace();
			}
			
		
		
			
			
			
			
		
		return toDate;
	
		
	}
	
	
	
	
}
