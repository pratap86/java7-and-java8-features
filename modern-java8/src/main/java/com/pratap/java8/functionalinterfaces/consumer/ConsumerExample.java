package com.pratap.java8.functionalinterfaces.consumer;

import java.util.List;
import java.util.function.Consumer;

import com.pratap.java8.beans.Student;
import com.pratap.java8.mockdata.StudentDataBase;

public class ConsumerExample {
	
	static List<Student> students = StudentDataBase.getAllStudents();
	static Consumer<Student> stdConsumer = student -> System.out.println(student);
	static Consumer<Student> stdNameConsumer = student -> System.out.print(student.getName());
	static Consumer<Student> stdActivitesConsumer = student -> System.out.println(student.getActivities());
	

	public static void printName() {
		students.forEach(stdConsumer);
		
	}
	
	public static void printNameAndActivities() {
		students.forEach(stdNameConsumer.andThen(stdActivitesConsumer));
	}
	
	public static void printNameAndActivitiesUsingCondition() {
		//if student gradeLevel >= 3
		students.forEach(student -> {
			if(student.getGradeLevel() >= 3) {
				stdNameConsumer.andThen(stdActivitesConsumer).accept(student);
			}
		});
	}
	public static void main(String[] args) {

		Consumer<String> consumer = str -> System.out.println(str.toUpperCase());
		consumer.accept("java8");
		printName();
		printNameAndActivities();
		System.out.println("printNameAndActivitiesUsingCondition");
		printNameAndActivitiesUsingCondition();
	}

}
