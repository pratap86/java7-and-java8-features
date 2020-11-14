package com.pratap.java8.defaults;

public interface Interface3 extends Interface2 {

	default void methodC() {
		System.out.println("Inside method C"+Interface3.class);
	}

	@Override
	default void methodB() {
		System.out.println("Inside method B"+Interface3.class);
	}

	@Override
	default void methodA() {
		System.out.println("Inside method A"+Interface3.class);
	}
	
	
}
