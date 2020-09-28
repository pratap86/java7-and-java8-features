package com.pratap.java8.streams;

import java.util.List;

import com.pratap.java8.beans.Student;
import com.pratap.java8.data.StudentDataBase;

public class StreamsMatchExample {

	// allMatch
	public static boolean allMatch(List<Student> students) {
		return students.stream().allMatch(student -> student.getGpa() >= 4.5);
	}

	// anyMatch
	public static boolean anyMatch(List<Student> students) {
		return students.stream().anyMatch(student -> student.getGpa() >= 3.9);
	}

	// noneMatch
	public static boolean noneMatch(List<Student> students) {
		return students.stream().noneMatch(student -> student.getGpa() >= 4.8);
	}

	public static void main(String[] args) {

		// students
		List<Student> students = StudentDataBase.getAllStudents();
		
		System.out.println(allMatch(students));
		System.out.println(anyMatch(students));
		System.out.println(noneMatch(students));
	}

}
