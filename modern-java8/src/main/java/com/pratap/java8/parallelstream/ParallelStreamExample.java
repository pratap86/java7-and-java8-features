package com.pratap.java8.parallelstream;

import java.util.function.Supplier;
import java.util.stream.IntStream;
/**
 * use fork/join framework, to split the available stream in to multiple parts depends on available processor, process 
 * and accumulate the result.
 * @author 835698
 *
 */
public class ParallelStreamExample {

	// below methods are a Supplier - No input but return something
	
	public static int sumSequentialStream() {
		return IntStream.rangeClosed(1, 100000).sum();
	}
	
	public static int sumParallelStream() {
		return IntStream.rangeClosed(1, 100000)
				.parallel()
				.sum();
	}
	
	public static long checkPerformanceResult(Supplier<Integer> supplier, int times) {
		
		long startTime = System.currentTimeMillis();
		
		for(int i = 0; i < times; i++) {
			supplier.get();
		}
		
		long endTime = System.currentTimeMillis();
		
		return endTime - startTime;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Available Processor in this machine are : "+Runtime.getRuntime().availableProcessors());

		System.out.println("Time taken by Sequential processing : "+checkPerformanceResult(ParallelStreamExample::sumSequentialStream, 200));
		
		System.out.println("Time taken by Parallel processing : "+checkPerformanceResult(ParallelStreamExample::sumParallelStream, 200));
		
	}

}
