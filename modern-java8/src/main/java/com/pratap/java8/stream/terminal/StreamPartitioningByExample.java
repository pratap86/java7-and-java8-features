package com.pratap.java8.stream.terminal;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toSet;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

import com.pratap.java8.beans.Student;
import com.pratap.java8.data.StudentDataBase;
/**
 * Terminal OPeration - partitioningBy()
 * is also kind of groupingBy, accept a predicate as input, return type of collector is going to be Map<K, V>
 * The key of return type going to be a boolean
 * Two different versions of partitioningBy
 * 1. partitioningBy(predicate)
 * 2. partitioningBy(predicate, downstream), downstream could be a any collector
 * 
 * @author 835698
 *
 */
public class StreamPartitioningByExample {

	private static List<Student> students = StudentDataBase.getAllStudents();
	private static Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.8;
	
	public static void partitioningBy_1() {
		Map<Boolean, List<Student>> partitioningMap = students.stream().collect(partitioningBy(gpaPredicate));
		System.out.println(partitioningMap);
	}
	
	public static void partitioningBy_2() {
		Map<Boolean, Set<Student>> partitioningSet = students.stream().collect(partitioningBy(gpaPredicate, toSet()));
		System.out.println(partitioningSet);
	}
	public static void main(String[] args) {
		partitioningBy_1();
		partitioningBy_2();
	}

}
