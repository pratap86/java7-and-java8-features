package com.pratap.java8.optional;

import java.util.Optional;

public class OptionalPresentExample {

	public static void main(String[] args) {

		//isPresent
		Optional<String> optional = Optional.ofNullable(null);
		System.out.println(optional.isPresent());
		if(optional.isPresent())
			System.out.println(optional.get());
		
		//ifPresent
		optional.ifPresent(System.out::println);
		optional.ifPresentOrElse(System.out::print, () -> System.out.println("Not present"));
	}

}
