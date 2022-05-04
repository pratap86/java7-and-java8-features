package com.pratap.java8.stream.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Stream API - reduce()
 * Terminal operation, used to reduce the contents of stream to a single value
 * It takes two parameters as input
 * 1st parameter - default or initial value
 * 2nd parameter - BinaryOperator<T>
 */
public class NumericStreamExample {

	public static int sumOfNNumbers(List<Integer> integerList) {
		return integerList.stream().reduce(0, (x, y) -> x+y); // unboxing to convert Integer to int
	}
	
	public static int sumOfNNumbersIntStream() {
		return IntStream.rangeClosed(1, 6)
				//1
				//2
				//3
				//4
				//5
				//6
				.sum();
	}
	
	public static void main(String[] args) {

		List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);
		
		System.out.println("sum of N numbers by reduce : "+sumOfNNumbers(integerList));
		
		System.out.println("sum of N numbers by intStream : "+sumOfNNumbersIntStream());
	}

}
