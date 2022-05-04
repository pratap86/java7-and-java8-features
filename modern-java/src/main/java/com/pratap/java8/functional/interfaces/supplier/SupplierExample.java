package com.pratap.java8.functional.interfaces.supplier;

import java.util.List;
import java.util.function.Supplier;

import com.pratap.java8.beans.Student;
import com.pratap.java8.mockdata.StudentDataBase;

/**
 * 
 * @author 835698
 * Supplier is just opposite to Consumer, its take no input while return a type.
 * T get();
 * accept(T  t); -> Consumer
 */
public class SupplierExample {

	static Supplier<Student> studentSupplier = () -> StudentDataBase.getAllStudents().get(0);
	
	static Supplier<List<Student>> studentsSupplier = () -> StudentDataBase.getAllStudents();
	
	public static void main(String[] args) {

		System.out.println(studentSupplier.get());
		System.out.println(studentsSupplier.get());
	}

}
