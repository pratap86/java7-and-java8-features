package com.pratap.java8.datetime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ComparingTimesDurationExample {

	public static void main(String[] args) {

		LocalTime localTime = LocalTime.of(7, 20);
		LocalTime localTime2 = LocalTime.of(8, 20);
		
		long diff = localTime.until(localTime2, ChronoUnit.MINUTES);
		System.out.println(diff);
		
		System.out.println("toMinutes : "+Duration.between(localTime, localTime2).toMinutes());
		
		System.out.println("toMinutes :"+Duration.ofHours(3).toMinutes());
	}

}
