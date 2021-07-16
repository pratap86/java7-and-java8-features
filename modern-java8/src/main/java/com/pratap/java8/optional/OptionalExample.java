package com.pratap.java8.optional;

import java.util.Optional;

import com.pratap.java8.beans.Student;
import com.pratap.java8.mockdata.StudentDataBase;

public class OptionalExample {

	public static Optional<String> getStudentNameOptional() {
		
		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
//		Optional<Student> studentOptional = Optional.ofNullable(null);
		if(studentOptional.isPresent()) {
			return studentOptional.map(Student::getName);
		}
		return Optional.empty();
	}
	public static void main(String[] args) {

		Optional<String> nameOptional = getStudentNameOptional();
		if(nameOptional.isPresent()) {
			System.out.println(nameOptional.get());
		} else {
			System.out.println("Name not found");
		}
	}

}
