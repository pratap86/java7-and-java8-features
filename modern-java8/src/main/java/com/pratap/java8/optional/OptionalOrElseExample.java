package com.pratap.java8.optional;

import java.util.Optional;

import com.pratap.java8.beans.Student;
import com.pratap.java8.data.StudentDataBase;

public class OptionalOrElseExample {

	//orElse
	
	public static String optionalOrElse() {
//		Optional<Student> studentOptinal = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		Optional<Student> studentOptinal = Optional.ofNullable(null);//Optional.empty
		System.out.println(studentOptinal);
		String studentName = studentOptinal.map(Student::getName).orElse("Default");
		return studentName;
	}
	//orElseGet
	public static String optionalOrElseGet() {
		Optional<Student> studentOptinal = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		String studentName = studentOptinal.map(Student::getName).orElseGet(() ->"Default");
		return studentName;
	}
	
	//orElseThrow
	public static String optionalOrElseThrow() {
		 Optional<Student> studentOptional = Optional.ofNullable(null);
		 String studentName = studentOptional.map(Student::getName).orElseThrow(() -> new RuntimeException("No Data Available"));
		 return studentName;
	}
	
	public static void main(String[] args) {
		System.out.println(optionalOrElse());
		System.out.println(optionalOrElseGet());
		System.out.println(optionalOrElseThrow());
		
	}

}
