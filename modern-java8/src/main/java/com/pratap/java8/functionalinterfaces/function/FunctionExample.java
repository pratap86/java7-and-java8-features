package com.pratap.java8.functionalinterfaces.function;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

import com.pratap.java8.beans.Student;
import com.pratap.java8.mockdata.StudentDataBase;

public class FunctionExample {
	
	static Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.9;
	
	static Function<List<Student>, Map<String, Double>> studentFucntion = students -> {
		
		Map<String, Double> studentGradeMap = new HashMap<String, Double>();
		
		students.forEach(student -> {
			if(gpaPredicate.test(student)) {
				studentGradeMap.put(student.getName(), student.getGpa());
			}
		});
		
		return studentGradeMap;
	};

	public static void main(String[] args) {
		
		System.out.println(studentFucntion.apply(StudentDataBase.getAllStudents()));
		
	}

}
