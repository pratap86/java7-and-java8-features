package com.pratap.java8.stream;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfGenerateIterateExample {

	public static void main(String[] args) {

		Stream<String> strStream = Stream.of("Pratap", "Shankar", "Joy");
		strStream.forEach(System.out::println);
		
		Stream.iterate(1, x -> x+2).limit(10).forEach(System.out::println);
		
		Supplier<Integer> randomSuppler = new Random() :: nextInt;
		Stream.generate(randomSuppler).limit(10).forEach(System.out::println);
	}

}
