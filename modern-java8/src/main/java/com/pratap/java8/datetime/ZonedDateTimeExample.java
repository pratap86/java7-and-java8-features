package com.pratap.java8.datetime;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {

	public static void main(String[] args) {

		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		
		System.out.println("zonedDateTime : "+zonedDateTime);
		System.out.println("getOffset : "+zonedDateTime.getOffset());
		System.out.println("zone Id : "+zonedDateTime.getZone());
		// list of available zone ids
		System.out.println("Available zones :");
		ZoneId.getAvailableZoneIds().stream().forEach(System.out::println);
		
		System.out.println(ZonedDateTime.now(ZoneId.of("Asia/Kolkata")));
		System.out.println(ZonedDateTime.now(ZoneId.of("America/Argentina/Buenos_Aires")));
		System.out.println(ZonedDateTime.now(ZoneId.of("Europe/Nicosia")));
		System.out.println(ZonedDateTime.now(ZoneId.of("America/Los_Angeles")));
		
		System.out.println("Zoned date time using Clock : "+ZonedDateTime.now(Clock.system(ZoneId.of("Australia/Melbourne"))));
		/**
		 * convert from localdatetime, instant to zonedlocaldate and time
		 */
		System.out.println("zoneId from localdatetime.now "+LocalDateTime.now(ZoneId.of("America/Los_Angeles")));
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime.atZone(ZoneId.of("America/Los_Angeles")));
		
		
		
		 
	}

}
