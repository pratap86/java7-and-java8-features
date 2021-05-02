package com.pratap.java8.stream.terminal;

import java.util.List;
import java.util.Optional;

import com.pratap.java8.beans.Student;
import com.pratap.java8.mockdata.StudentDataBase;

import static java.util.stream.Collectors.minBy;
import static java.util.stream.Collectors.maxBy;

import java.util.Comparator;

/**
 * Terminal Operations - maxBy(), minBy() Comparator as input and Optional as
 * output. 
 * maxBy - this collector used in conjunction with comparator, returns the
 * max element based on the property passed to the comparator. 
 * minBy - this collector used in conjunction with comparator, returns the smallest element
 * based on the property passed to the comparator.
 * 
 * @author 835698
 *
 */
public class StreamMinByMaxByExample {

	private static List<Student> students = StudentDataBase.getAllStudents();
	
	public static Optional<Student> minBy_Example(){
		return students.stream().collect(minBy(Comparator.comparing(Student::getGpa)));
	}
	
	public static Optional<Student> maxBy_Example(){
		return students.stream().collect(maxBy(Comparator.comparing(Student::getGpa)));
	}
	public static void main(String[] args) {

		System.out.println(minBy_Example());
		System.out.println(maxBy_Example());
	}

}
