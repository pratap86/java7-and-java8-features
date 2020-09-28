package com.pratap.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

	public static Optional<Integer> limit(List<Integer> nums){
		return nums.stream()
					.limit(3)
					.reduce((x, y) -> x+y);// 2, 3, 4
	}
	
	public static Optional<Integer> skip(List<Integer> nums){
		return nums.stream()
					.skip(3)
					.reduce((x, y) -> x+y);//6, 8, 10
	}
	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(2, 3, 4, 6, 8, 10);
		
		Optional<Integer> limitOptional = limit(nums);
		
		if(limitOptional.isPresent()) {
			System.out.println("Limit result : "+limitOptional.get());
		}
		
		Optional<Integer> skipOptional = skip(nums);
		if(skipOptional.isPresent()) {
			System.out.println("Skip result : "+skipOptional.get());
		}
	}

}
