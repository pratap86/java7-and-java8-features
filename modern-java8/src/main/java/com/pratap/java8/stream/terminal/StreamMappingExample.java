package com.pratap.java8.stream.terminal;

import com.pratap.java8.beans.Student;
import com.pratap.java8.data.StudentDataBase;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

import java.util.List;
import java.util.Set;

public class StreamMappingExample {

	public static void main(String[] args) {

		// use case, get the student names as List<String> from StudentDataBase
		List<String> nameList = StudentDataBase.getAllStudents()
		.stream()
		.collect(mapping(Student::getName, toList()));
		
		System.out.println(nameList);
		
		Set<String> nameSet = StudentDataBase.getAllStudents()
				.stream()
				.collect(mapping(Student::getName, toSet()));
		System.out.println(nameSet);
		// by doing this, avoid one internal call of mapping
		StudentDataBase.getAllStudents().stream().map(Student::getName);
	}

}
