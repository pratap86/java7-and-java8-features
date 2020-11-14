package com.pratap.java8.defaults;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodExample {

	public static void main(String[] args) {

		/**
		 * sort the list names in alphabetical order
		 */
		List<String> stringList = Arrays.asList("Adam", "Jenny", "Alex", "Dan", "Mike", "Eric");
		
		// prior java8
		Collections.sort(stringList);
		System.out.println(stringList);
		
		//java8
		stringList.sort(Comparator.naturalOrder());
		System.out.println(stringList);
		
		stringList.sort(Comparator.reverseOrder());
		System.out.println(stringList);
		
	}

}
