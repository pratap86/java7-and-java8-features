package com.pratap.java8.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativeEx02 {

	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(1, 2, 2, 2, 3, 4, 4, 5, 5, 8, 8);

		// 1. Imperative approach

		List<Integer> uniqueList = new ArrayList<>();
		for (int num : intList) {
			if (!uniqueList.contains(num)) {
				uniqueList.add(num);
			}
		}
		System.out.println("Imperative : "+uniqueList);

		// 1. Declarative approach
		List<Integer> uniqueList1 = intList.stream()
					.distinct()
					.collect(Collectors.toList());
		
		System.out.println("Declarative : "+uniqueList1);
	}

}
