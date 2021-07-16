package com.pratap.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.pratap.java8.beans.Student;
import com.pratap.java8.mockdata.StudentDataBase;

public class StreamsReduceExample {

	// perform multiply in nums
	public static int performMultiplication(List<Integer> nums) {
		return nums.stream().reduce(1, (a, b) -> a * b);
	}

	public static int performAddition(List<Integer> nums) {
		return nums.stream().reduce(0, (a, b) -> a + b);
	}

	public static Optional<Student> getHighestGpaStudent() {

		return StudentDataBase.getAllStudents().stream()
				.reduce((student1, student2) -> (student1.getGpa() > student2.getGpa()) ? student1 : student2);
	}

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(2, 3, 5);
		System.out.println(performMultiplication(nums));
		System.out.println(performAddition(nums));

		if (getHighestGpaStudent().isPresent()) {
			System.out.println(getHighestGpaStudent().get());
		}
	}

}
