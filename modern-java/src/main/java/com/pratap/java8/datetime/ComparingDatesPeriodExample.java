package com.pratap.java8.datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class ComparingDatesPeriodExample {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.of(2020, Month.JANUARY, 01);
		LocalDate localDate2 = LocalDate.of(2020, Month.JANUARY, 31);
		Period period = Period.between(localDate, localDate2);
		System.out.println(" getDays : "+period.getDays());
		System.out.println("getMonths : "+period.getMonths());
		System.out.println("getYears : "+period.getYears());
		
		Period periodDays = Period.ofDays(10);
		System.out.println("Period.getDays() "+periodDays.getDays());
		Period periodYears = Period.ofYears(10);
		System.out.println("Period.getYears() :"+periodYears.getYears());
		System.out.println("Period.toTotalMonths() :"+periodYears.toTotalMonths());
	}

}
