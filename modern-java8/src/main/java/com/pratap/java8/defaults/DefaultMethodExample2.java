package com.pratap.java8.defaults;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import com.pratap.java8.beans.Student;
import com.pratap.java8.data.StudentDataBase;

public class DefaultMethodExample2 {

	public static Consumer<Student> studentConsumer = System.out::println;
	
	public static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
	
	public static  Comparator<Student> gpaComparator = Comparator.comparingDouble(Student::getGpa);
	
	public static Comparator<Student> nullComparator = Comparator.nullsFirst(nameComparator);
	
	public static void main(String[] args) {

		List<Student> students = StudentDataBase.getAllStudents();
		System.out.println("Before Sorting");
		students.forEach(studentConsumer);
		System.out.println("Sort by name");
		students.sort(nullComparator);
		//students.sort(nameComparator);
		students.forEach(studentConsumer);
		System.out.println("Sort By GPA");
		students.sort(gpaComparator);
		System.out.println(students);
		System.out.println("comparator chaining");
		students.sort(gpaComparator.thenComparing(nameComparator));
		System.out.println(students);

	}

}
