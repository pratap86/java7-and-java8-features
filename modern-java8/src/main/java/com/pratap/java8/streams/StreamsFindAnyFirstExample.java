package com.pratap.java8.streams;

import java.util.List;
import java.util.Optional;

import com.pratap.java8.beans.Student;
import com.pratap.java8.data.StudentDataBase;

public class StreamsFindAnyFirstExample {

	public static Optional<Student> findAny(List<Student> students) {

		return students.stream().filter(student -> student.getGpa() > 3.9).findAny();
	}

	public static Optional<Student> findFirst(List<Student> students) {

		return students.stream().filter(student -> student.getGpa() > 3.9).findFirst();
	}

	public static void main(String[] args) {

		System.out.println("find Any : ");
		Optional<Student> findAnyOptinal = findAny(StudentDataBase.getAllStudents());
		
		if(findAnyOptinal.isPresent()) {
			System.out.println(findAnyOptinal.get());
		} else {
			System.out.println("No student present !");
		}
		
		System.out.println("find First : ");
		
		Optional<Student> findFirstOptional = findFirst(StudentDataBase.getAllStudents());
		if(findFirstOptional.isPresent()) {
			System.out.println(findFirstOptional.get());
		} else {
			System.out.println("No student present");
		}
	}

}
