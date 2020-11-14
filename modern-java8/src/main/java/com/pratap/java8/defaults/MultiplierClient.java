package com.pratap.java8.defaults;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {

	public static void main(String[] args) {

		Multiplier multiplier = new MultiplierImpl();
		List<Integer> integerList = Arrays.asList(2, 3, 5);
		System.out.println("Multiply result is : "+multiplier.multiply(integerList));
		System.out.println("Default size is : "+multiplier.size(integerList));
		System.out.println("integerList is empty : "+Multiplier.isEmpty(integerList));
	}

}
