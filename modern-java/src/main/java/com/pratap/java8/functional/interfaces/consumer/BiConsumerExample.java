package com.pratap.java8.functional.interfaces.consumer;

import java.util.List;
import java.util.function.BiConsumer;

import com.pratap.java8.beans.Student;
import com.pratap.java8.mockdata.StudentDataBase;

public class BiConsumerExample {

	static List<Student> students = StudentDataBase.getAllStudents();
	
	static BiConsumer<String, List<String>> nameAndActivities = (name, activities) -> System.out.println(name+":"+activities);
	
	public static void printNameAndActivities() {
		students.forEach(student -> nameAndActivities.accept(student.getName(), student.getActivities()));
	}
	
	public static void main(String[] args) {

		printNameAndActivities();
	}

}
