package com.pratap.java8.stream.practice;


import java.util.List;

import com.pratap.java8.mockdata.StudentDataBase;
import org.junit.jupiter.api.Test;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;

public class CollectWorkingTest {

	@Test
	public void understandingCollect() {

		List<String> activities = StudentDataBase.getAllStudents()
			.stream()
			.map(student -> student.getActivities())
			.flatMap(List::stream)
			.collect(
					() -> new ArrayList<>(),// supplier
					(list, element) -> list.add(element),// accumulator
					(list1, list2) -> list1.addAll(list2)// combiner
					); 
			//.collect(toList());
		
		activities.forEach(System.out::println);
	}

}
