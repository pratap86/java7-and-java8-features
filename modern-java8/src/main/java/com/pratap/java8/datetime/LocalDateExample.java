package com.pratap.java8.datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		
		LocalDate localDate2 = LocalDate.of(2020, Month.NOVEMBER, 16);
		System.out.println(localDate2);
		
		LocalDate localDate3 = LocalDate.ofYearDay(2020, 2);
		System.out.println(localDate3);
		
		/**
		 * get values from localDate
		 */
		System.out.println("getMonth : "+localDate.getMonth());
		System.out.println("getMonthValue : "+localDate.getMonthValue());
		System.out.println("getDayOfWeek : "+localDate.getDayOfMonth());
		System.out.println("getDayOfYear : "+localDate.getDayOfYear());
		System.out.println("getDayOfWeek : "+localDate.getDayOfWeek());
		System.out.println("Day of month using get : "+localDate2.get(ChronoField.DAY_OF_MONTH));
		System.out.println("Day of week using get : "+localDate2.get(ChronoField.DAY_OF_WEEK));
		
		/**
		 * Modifying local date
		 */
		System.out.println("plusDays : "+localDate.plusDays(2));
		System.out.println("plusMonth : "+localDate.plusMonths(2));
		System.out.println("minusDays : "+localDate.minusDays(2));
		System.out.println("withYear : "+localDate.withYear(2019));
		System.out.println("withChronoField : "+localDate.with(ChronoField.YEAR, 2020));
		System.out.println("TemporalAdjusters : "+localDate.with(TemporalAdjusters.firstDayOfNextMonth()));
	}

}
