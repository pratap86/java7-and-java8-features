package com.pratap.java8.stream;

import java.util.List;

import com.pratap.java8.beans.Student;
import com.pratap.java8.mockdata.StudentDataBase;

import static java.util.stream.Collectors.toList;

public class StreamsFlatMapExample {

	// display all activities of Student
	public static List<String> printStudentActivities(){
		return
				StudentDataBase.getAllStudents().stream()
												.map(Student::getActivities)
												.flatMap(List::stream)
												.distinct()
												.sorted() // sorted in alphabatical order
												.collect(toList());
	}
	
	public static long getStudentActivitiesCount(){
		return
				StudentDataBase.getAllStudents().stream()
												.map(Student::getActivities)
												.flatMap(List::stream)
												.distinct()
												.count();
	}
	
	
	public static void main(String[] args) {

		System.out.println("printStudentActivities : "+printStudentActivities());
		
		System.out.println("getStudentActivitiesCount: "+getStudentActivitiesCount());
	}

}
