package com.pratap.java8.stream;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.pratap.java8.beans.Student;
import com.pratap.java8.data.StudentDataBase;

public class StreamsExample {

	public static void main(String[] args) {

		// use case - print those student(name and activities) whose grade level > 3 and gpa >= 3.9
		
		Predicate<? super Student> gradeLevelPredicate = student -> student.getGradeLevel() >= 3;
		Predicate<? super Student> gpaPredicate = student -> student.getGpa() >= 3.9;
		
		Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()
																.filter(gradeLevelPredicate)
																.filter(gpaPredicate)
																.collect(Collectors.toMap(Student::getName, Student::getActivities));
		
		System.out.println(studentMap);
	}

}
