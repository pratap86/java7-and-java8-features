package com.pratap.java8.streams;

import java.util.Arrays;
import java.util.List;

public class StreamsMinMaxExample {
	
	public static int findMaxValue(List<Integer> nums) {
		return nums.stream()
				.reduce(0, (a, b) -> (a > b) ? a : b);
	}

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(6, 7, 8, 9, 10);
		System.out.println(findMaxValue(nums));
	}

}
