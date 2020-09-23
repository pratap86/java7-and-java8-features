package com.pratap.java8.methodreference;

import java.util.function.Function;

public class FunctionMethodRefExample {

	static Function<String, String> toUpperCaseLambda = String::toUpperCase;
	
	public static void main(String[] args) {

		System.out.println(toUpperCaseLambda.apply("pratap"));
	}

}
