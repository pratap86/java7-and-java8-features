package com.pratap.java8.parallelstream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
/**
 * when not to use parallel stream - unboxing from Integer to int
 * @author 835698
 *
 */
public class ParallelStreamBoxExample {

	public static int sequentialSum(List<Integer> integerList) {

		int sum = 0;

		long startTime = System.currentTimeMillis();

		sum = integerList.stream().reduce(1, (x, y) -> x + y);

		long duration = System.currentTimeMillis() - startTime;
		System.out.println("Time taken in sequential sum : " + duration);

		return sum;
	}

	public static int parallelSum(List<Integer> integerList) {

		int sum = 0;

		long startTime = System.currentTimeMillis();

		sum = integerList
				.parallelStream()
				.reduce(1, (x, y) -> x + y); //perform un-boxing from Integer to int behind the scene for each and every value passes to the stream.

		long duration = System.currentTimeMillis() - startTime;
		System.out.println("Time taken in parallel sum : " + duration);

		return sum;
	}

	public static void main(String[] args) {

		List<Integer> integerList = IntStream.rangeClosed(1, 10000).boxed().collect(Collectors.toList());
		
		sequentialSum(integerList);
		parallelSum(integerList);
	}

}
