package com.pratap.java8.functional.interfaces.function;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

	static Comparator<Integer> comparator = (a, b) -> a.compareTo(b);
	
	// use case - when input(2 inputs) & output are same type
	
	public static void main(String[] args) {

		BinaryOperator<Integer> binOperator = (a, b) -> a*b;
		System.out.println(binOperator.apply(4, 5));
		
		BinaryOperator<Integer> maxByBinOPerator = BinaryOperator.maxBy(comparator);
		System.out.println(maxByBinOPerator.apply(4, 5));
		
		BinaryOperator<Integer> minByBinOperator = BinaryOperator.minBy(comparator);
		System.out.println(minByBinOperator.apply(4, 5));
	}

}
