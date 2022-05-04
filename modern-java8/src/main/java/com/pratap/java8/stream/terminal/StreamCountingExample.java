package com.pratap.java8.stream.terminal;

import static java.util.stream.Collectors.counting;

import com.pratap.java8.mockdata.StudentDataBase;

public class StreamCountingExample {

	public static long count() {
		return StudentDataBase.getAllStudents()
				.stream()
				.filter(student -> student.getGpa() >= 3.9).count();
	}
	public static void main(String[] args) {

		System.out.println(count());
	}

}
