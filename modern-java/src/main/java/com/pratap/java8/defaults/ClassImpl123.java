package com.pratap.java8.defaults;

public class ClassImpl123 implements Interface1, Interface2, Interface3 {

	public void methodA() {
		System.out.println("Inside method A"+ClassImpl123.class);
	}
	public static void main(String[] args) {

		/**
		 * Implementation preferences
		 * 1. class that implements interface
		 * 2. the sub interface that extends the interface
		 * 
		 */
		ClassImpl123 impl = new ClassImpl123();
		impl.methodA();
		impl.methodB();
		impl.methodC();
	}

}
