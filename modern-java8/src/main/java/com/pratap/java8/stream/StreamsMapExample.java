package com.pratap.java8.stream;

import java.util.List;
import java.util.stream.Collectors;

import com.pratap.java8.beans.Student;
import com.pratap.java8.data.StudentDataBase;

public class StreamsMapExample {

	// use case - get the student name only from DB and print
	public static void main(String[] args) {

		List<String> names = StudentDataBase.getAllStudents().stream()
										.map(Student::getName)
										.map(String::toUpperCase)
										.collect(Collectors.toList());
		System.out.println(names);
	}

}
