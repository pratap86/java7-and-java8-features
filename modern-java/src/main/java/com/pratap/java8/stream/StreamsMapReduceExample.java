package com.pratap.java8.stream;

import com.pratap.java8.beans.Student;
import com.pratap.java8.mockdata.StudentDataBase;

public class StreamsMapReduceExample {

	// get total num of noteBooks in Student DB
	public static int getTotalNoteBooks() {
		
		return StudentDataBase.getAllStudents().stream()
				.filter(student -> student.getGradeLevel() > 3)
				.filter(student -> student.getGender().equals("female"))
				.map(Student::getNoteBooks)
				//.reduce(0, (a, b) -> a+b);
				.reduce(0, Integer::sum);// In Integer class, there is no such method for multiply, we should go with only above way
	}
	public static void main(String[] args) {

		System.out.println("Total Books in Student DB : "+getTotalNoteBooks());
		
	}

}
