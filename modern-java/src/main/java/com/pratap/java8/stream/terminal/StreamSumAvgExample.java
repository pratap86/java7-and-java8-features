package com.pratap.java8.stream.terminal;

import java.util.List;

import com.pratap.java8.beans.Student;
import com.pratap.java8.mockdata.StudentDataBase;

import static java.util.stream.Collectors.summingInt;
import static java.util.stream.Collectors.averagingInt;

public class StreamSumAvgExample {

	// use case - summation of all note books, that student db has.
	private static List<Student> students = StudentDataBase.getAllStudents();
	
	public static int sum() {
		return students.stream()
				.collect(summingInt(Student::getNoteBooks));
	}
	
	public static double avg() {
		return students.stream()
				.collect(averagingInt(Student::getNoteBooks));
	}
	public static void main(String[] args) {

		System.out.println("Total Num of books : "+sum());
		
		System.out.println(" Av Total Num of books : "+avg());
	}

}
