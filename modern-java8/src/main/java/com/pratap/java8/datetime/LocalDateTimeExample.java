package com.pratap.java8.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeExample {

	public static void main(String[] args) {

		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		
		LocalDateTime localDateTime2 = LocalDateTime.of(1998, 10, 21, 21, 59, 33, 8945478);
		System.out.println("localDateTime2 : "+localDateTime2);
		
		LocalDateTime localDateTime3 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println("localDateTime3 : "+localDateTime3);
		
		/**
		 * getting the time and date from localdatetime instance
		 */
		System.out.println("getHour : "+localDateTime.getHour());
		System.out.println("getMinute : "+localDateTime.getMinute());
		System.out.println("getSecond : "+localDateTime.getSecond());
		
		/**
		 * Modifying the localdatetime
		 */
		System.out.println("plusHours : "+localDateTime.plusHours(2));
		System.out.println("minusDays : "+localDateTime.minusDays(2));
		
		//converting localdate, localtime to localdatetime and viceversa
		
		LocalDate localDate = LocalDate.of(2019, Month.JANUARY, 26);
		System.out.println("atTime : "+localDate.atTime(22, 45));
		
		LocalTime localTime = LocalTime.of(22, 35);
		System.out.println("atDate : "+localTime.atDate(localDate));
		
		LocalDateTime localDateTime4 = localTime.atDate(localDate);
		System.out.println("toLocalDate : "+localDateTime4.toLocalDate());
		
		System.out.println("toLocalTime : "+localDateTime4.toLocalTime());
	}

}
