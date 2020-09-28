package com.pratap.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.pratap.java8.beans.Student;
import com.pratap.java8.data.StudentDataBase;

public class StreamsMinMaxExample {
	
	public static int findMaxValue(List<Integer> nums) {
		return nums.stream()
				.reduce(0, (a, b) -> (a > b) ? a : b);
	}
	
	public static Optional<Integer> findMaxValueOptional(List<Integer> nums) {
		return nums.stream()
				.reduce((a, b) -> (a > b) ? a : b);
	}

	public static Optional<Integer> findMinValueOptional(List<Integer> nums) {
		return nums.stream()
				.reduce((a, b) -> (a < b) ? a : b);
	}
	
	// highest grade student
	public static Optional<Integer> findHighestGradeStudent(List<Student> students){
		return students.stream()
						.map(student -> student.getGradeLevel())
						.reduce((gradeLevel1, gradeLevel2) -> (gradeLevel1 > gradeLevel2) ? gradeLevel1 : gradeLevel2 );
	}
	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<>();
		System.out.println("without optional : "+findMaxValue(nums));
		
		if(findMaxValueOptional(nums).isPresent()) {
			System.out.println("with optional : "+findMaxValueOptional(nums).get());
		} else {
			System.out.println("Input list is empty.");
		}
		
		List<Integer> numList = Arrays.asList(2, 4, 5, 8, 10);
		
		if(findMinValueOptional(numList).isPresent()) {
			System.out.println("min value : "+findMinValueOptional(numList).get());
		}
		Optional<Integer> highestGradeOptional = findHighestGradeStudent(StudentDataBase.getAllStudents());
		if(highestGradeOptional.isPresent()) {
			System.out.println("Highest grade in student DB : "+ highestGradeOptional.get());
		}
	}

}
