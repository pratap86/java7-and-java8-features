package com.pratap.java8.basics;

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeEx01 {

	public static void main(String[] args) {

		// 1. add numbers from 0 to 100 by Imperative style
		
		int sum = 0; // mutating the sum var in each iteration 
		
		for(int i = 0; i < 100; i++) {
			sum +=i;
		}
		System.out.println("Sum using imperative approach "+sum);
		
		// 2. add numbers from 0 to 100 by Declarative style
		int sum1 = IntStream.range(0, 100)
				.parallel()//multi threaded
				.sum();
		System.out.println("Sum using declarative approach "+sum1);
	}

}
