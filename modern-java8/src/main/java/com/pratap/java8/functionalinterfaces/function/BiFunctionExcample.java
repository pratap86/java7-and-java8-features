package com.pratap.java8.functionalinterfaces.function;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.pratap.java8.beans.Student;
import com.pratap.java8.mockdata.StudentDataBase;

public class BiFunctionExcample {

	static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> studentFunction = (students, predicate) -> {
		
		Map<String, Double> studentGpaMap = new HashMap<String, Double>();
		students.forEach(student -> {
			if(predicate.test(student)) {
				studentGpaMap.put(student.getName(), student.getGpa());
			}
		});
		return studentGpaMap;
	};
	public static void main(String[] args) {

		System.out.println(studentFunction.apply(StudentDataBase.getAllStudents(), student -> student.getGpa() >= 3.9));
	}

}
