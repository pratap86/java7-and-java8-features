package com.pratap.java8.datetime;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {

	public static void main(String[] args) {

		LocalTime localTime = LocalTime.now();
		System.out.println("localTime : "+localTime);
		
		LocalTime localTime2 = LocalTime.of(23, 33);
		System.out.println("localTime2 : "+localTime2);
		
		LocalTime localTime3 = LocalTime.of(23, 33, 59);
		System.out.println("localTime3 : "+localTime3);
		
		LocalTime localTime4 = LocalTime.of(23, 33, 59, 98009876);
		System.out.println("localTime4 : "+localTime4);
		
		/**
		 * getting the values from localTime
		 */
		System.out.println("getHour : "+localTime.getHour());
		System.out.println("getMinute : "+localTime.getMinute());
		System.out.println("CLOCK_HOUR_OF_DAY : "+localTime.get(ChronoField.CLOCK_HOUR_OF_DAY));
		System.out.println("toSecondOfDay : "+localTime.toSecondOfDay());// represents time in seconds
		
		/**
		 * Modify values of the localTime
		 */
		System.out.println("minusHours : "+localTime.minusHours(2));
		System.out.println("ChronoUnit.HOURS : "+localTime.minus(2, ChronoUnit.HOURS));
		System.out.println("MIDNIGHT : "+localTime.with(LocalTime.MIDNIGHT));
		System.out.println("HOUR_OF_DAY : "+localTime.with(ChronoField.HOUR_OF_DAY, 22));
		System.out.println("plusMinutes : "+localTime.plus(30, ChronoUnit.MINUTES));
	}

}
