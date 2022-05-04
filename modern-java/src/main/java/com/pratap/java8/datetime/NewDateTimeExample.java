package com.pratap.java8.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NewDateTimeExample {

	public static void main(String[] args) {

		// LocalDate
		System.out.println("LocalDate : "+ LocalDate.now());
		// LocalTime
		System.out.println("LocatTime : "+LocalTime.now());
		// LocalDateTime
		System.out.println("Local date time : "+LocalDateTime.now());
	}

}
