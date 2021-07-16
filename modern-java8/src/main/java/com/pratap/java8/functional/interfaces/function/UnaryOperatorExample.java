package com.pratap.java8.functional.interfaces.function;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

	// use case - when input & output are same type
	static UnaryOperator<String> unaryOperator = str -> str.toUpperCase();
	
	public static void main(String[] args) {

		System.out.println(unaryOperator.apply("pratap"));
	}

}
