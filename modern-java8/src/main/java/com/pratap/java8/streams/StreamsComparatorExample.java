package com.pratap.java8.streams;

import java.util.Comparator;
import java.util.List;
import static java.util.stream.Collectors.toList;

import com.pratap.java8.beans.Student;
import com.pratap.java8.data.StudentDataBase;

public class StreamsComparatorExample {

	// sort student by their name
	public static List<Student> sortStudentByName(){
		return StudentDataBase.getAllStudents().stream()
													.sorted(Comparator.comparing(Student::getName).reversed())
													.collect(toList());
	}
	public static void main(String[] args) {
		sortStudentByName().forEach(System.out::println);
	}

}
