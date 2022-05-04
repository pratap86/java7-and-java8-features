package com.pratap.java8.datetime;

import java.time.Instant;

public class InstantExample {

	public static void main(String[] args) {

		System.out.println(Instant.now());
		
		System.out.println("getEpochSecond : "+Instant.now().getEpochSecond());
	}

}
