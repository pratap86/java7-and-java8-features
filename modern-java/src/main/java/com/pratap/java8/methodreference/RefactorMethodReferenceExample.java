package com.pratap.java8.methodreference;

import java.util.function.Predicate;

import com.pratap.java8.beans.Student;
import com.pratap.java8.mockdata.StudentDataBase;

public class RefactorMethodReferenceExample {

	static Predicate<Student> stdPredicate = RefactorMethodReferenceExample::greaterThanGradeLevel;
	
	public static boolean greaterThanGradeLevel(Student student) {
		return student.getGpa() >= 3.9;
	}
	
	public static void main(String[] args) {

		System.out.println(stdPredicate.test(StudentDataBase.studentSupplier.get()));
		
	}

}
