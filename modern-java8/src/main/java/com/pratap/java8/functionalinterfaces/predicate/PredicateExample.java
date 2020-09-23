package com.pratap.java8.functionalinterfaces.predicate;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

import com.pratap.java8.beans.Student;
import com.pratap.java8.data.StudentDataBase;

public class PredicateExample {

	Predicate<Student> gradeLevelPredicate = student -> student.getGradeLevel() >= 3;
	Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.9;
	
	BiConsumer<String, List<String>> nameAndActivitiesConsumer = 
			(name, activities) -> System.out.println(name+":"+activities);
			
			List<Student> students = StudentDataBase.getAllStudents();
			
			// print name and activities of students whose gradelevel is greater or equal to 3
			
			public void printNameAndActivitiesUsingCondition() {
				students.forEach(student -> {
					if(gradeLevelPredicate.and(gpaPredicate).test(student)) {
						nameAndActivitiesConsumer.accept(student.getName(), student.getActivities());
					}
				});
			}
	public static void main(String[] args) {

		new PredicateExample().printNameAndActivitiesUsingCondition();
	}

}
