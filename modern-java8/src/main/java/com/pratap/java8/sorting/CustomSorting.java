package com.pratap.java8.sorting;

import com.pratap.java8.beans.Student;
import com.pratap.java8.mockdata.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class CustomSorting {

    public static void main(String[] args) {
        List<Student> students = StudentDataBase.getAllStudents();

        List<Student> sortedStudents = students.stream().sorted(Comparator.comparing(Student::getName).thenComparing(Student::getGpa)).collect(Collectors.toList());

        students.forEach(System.out::println);
    }
}
