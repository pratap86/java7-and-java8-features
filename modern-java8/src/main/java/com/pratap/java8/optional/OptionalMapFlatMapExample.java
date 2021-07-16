package com.pratap.java8.optional;

import java.util.Optional;

import com.pratap.java8.beans.Bike;
import com.pratap.java8.beans.Student;
import com.pratap.java8.mockdata.StudentDataBase;

public class OptionalMapFlatMapExample {

	//filter
	public static void optionalFilter() {
		Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		optionalStudent.filter(student -> student.getGpa() >= 3.5)
							.ifPresentOrElse(System.out::println, () -> System.out.println("No Student Found of GPA >= 3.5"));
		
	}
	
	//map
	public static void optionalMap() {
		Optional.ofNullable(StudentDataBase.studentSupplier.get())
					.filter(student -> student.getGpa() >= 3.7)
						.map(Student::getName)
							.ifPresentOrElse(System.out::println, () -> System.out.println("Not Found"));
	}
	
	//flatMap
	public static void optionalFlatMap() {
		
		Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		
		optionalStudent.filter(Student -> Student.getGpa() >= 3.5)
							.flatMap(Student::getBike)
							.map(Bike::getName)
							.ifPresentOrElse(System.out::println, () -> System.out.println("No Data Found"));
	}
	public static void main(String[] args) {
		optionalFilter();
		optionalMap();
		optionalFlatMap();
	}

}
