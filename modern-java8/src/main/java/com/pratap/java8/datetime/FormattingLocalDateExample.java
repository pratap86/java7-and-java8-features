package com.pratap.java8.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateExample {

	public static void main(String[] args) {

		String date = "2020-11-27";
		System.out.println(LocalDate.parse(date));
		
		LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println(localDate);
		
		String date1 = "20201127";//yyyyMMdd
		System.out.println(LocalDate.parse(date1, DateTimeFormatter.BASIC_ISO_DATE));
		// custome date time formatter
		String date3 = "2020|11|27";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
		System.out.println(LocalDate.parse(date3, formatter));
		
		String date4 = "2020*11*27";
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy*MM*dd");
		System.out.println(LocalDate.parse(date4, formatter1));
		
	}

}
