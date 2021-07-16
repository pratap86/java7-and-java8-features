package com.pratap.java8.stream;

import java.util.List;
import static java.util.stream.Collectors.toList;

import com.pratap.java8.beans.Student;
import com.pratap.java8.mockdata.StudentDataBase;

public class StreamsFilterExample {

	// filter Student by their gender = F
	public static List<Student> getFemaleStudents(){
		return
				StudentDataBase.getAllStudents().stream()
													.filter(student -> student.getGender().equals("female"))
													.filter(student -> student.getGpa() >= 3.8)
													.collect(toList());
	}
	public static void main(String[] args) {

		getFemaleStudents().forEach(System.out::println);
	}

}
