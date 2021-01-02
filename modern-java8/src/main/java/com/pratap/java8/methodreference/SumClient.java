package com.pratap.java8.methodreference;

import java.util.stream.IntStream;

import com.pratap.java8.parallelstream.Sum;
/**
 * when not to use parallel stream - when we have mutating variable, not recommended to use parallel stream.
 * @author 835698
 *
 */
public class SumClient {

	public static void main(String[] args) {

		Sum sum = new Sum();
		
//		IntStream.rangeClosed(1, 10000)
//					.forEach(sum :: performSum);
//		
//		System.out.println(sum.getTotal());
		
		// parallel stream
		
		IntStream.rangeClosed(1, 10000)
					.parallel()
					.forEach(sum::performSum);
		
		System.out.println(sum.getTotal());
	}

}
