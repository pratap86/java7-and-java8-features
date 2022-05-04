package com.pratap.java8.datetime;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class DateToLocalDate {

	public static void main(String[] args) {

		/**
		 * java.util.Date to java.time.LocalDate
		 */
		Date date = new Date();
		
		System.out.println(date);
		// conversion
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		System.out.println(localDate);
	}

}
