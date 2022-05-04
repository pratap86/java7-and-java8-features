package com.pratap.java8.methodreference;

import java.util.function.Function;
import java.util.function.Supplier;

import com.pratap.java8.beans.Student;

public class ConstructorRefExample {

	static Supplier<Student> student = Student::new;
	
	static Function<String, Student> student1 = Student::new;
	
	public static void main(String[] args) {

		System.out.println(student.get());
		System.out.println(student1.apply("Pratap"));
	}

}
