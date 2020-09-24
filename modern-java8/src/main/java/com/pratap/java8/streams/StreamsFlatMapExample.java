package com.pratap.java8.streams;

import java.util.List;

import com.pratap.java8.beans.Student;
import com.pratap.java8.data.StudentDataBase;
import static java.util.stream.Collectors.toList;

public class StreamsFlatMapExample {

	// display all activities of Student
	public static List<String> printStudentActivities(){
		return
				StudentDataBase.getAllStudents().stream()
												.map(Student::getActivities)
												.flatMap(List::stream)
												.collect(toList());
	}
	public static void main(String[] args) {

		System.out.println(printStudentActivities());
	}

}
