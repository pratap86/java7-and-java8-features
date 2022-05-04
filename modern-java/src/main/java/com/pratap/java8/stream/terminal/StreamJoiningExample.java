package com.pratap.java8.stream.terminal;

import java.util.stream.Collectors;

import com.pratap.java8.beans.Student;
import com.pratap.java8.mockdata.StudentDataBase;

public class StreamJoiningExample {

	public static String joining_1() {
		return StudentDataBase.getAllStudents().stream()
				.map(Student::getName)// Stream<String>
				.collect(Collectors.joining());
	}
	
	public static String joining_2() {
		return StudentDataBase.getAllStudents().stream()
				.map(Student::getName)// Stream<String>
				.collect(Collectors.joining("-"));
	}
	
	public static String joining_3() {
		return StudentDataBase.getAllStudents().stream()
				.map(Student::getName)// Stream<String>
				.collect(Collectors.joining("-", "(", ")"));
	}
	public static void main(String[] args) {

		System.out.println("joining_1 :"+joining_1());
		System.out.println("joining_2 :"+joining_2());
		System.out.println("joining_3 :"+joining_3());
	}

}
