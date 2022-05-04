package com.pratap.java8.defaults;

import java.util.List;

public interface Multiplier {

	int multiply(List<Integer> integerList);
	
	default int size(List<Integer> integerList) {
		System.out.println("Inside Multiplier");
		return integerList.size();
	}
	
	static boolean isEmpty(List<Integer> integerList) {
		return integerList.size() == 0;
	}
}
