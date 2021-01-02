package com.pratap.java8.defaults;

public class ClientImpl14 implements Interface1, Interface4 {

	public static void main(String[] args) {

		ClientImpl14 impl = new ClientImpl14();
		impl.methodA();
	}

	@Override
	public void methodA() {
		System.out.println("Inside method A"+ClientImpl14.class);
	}

}
