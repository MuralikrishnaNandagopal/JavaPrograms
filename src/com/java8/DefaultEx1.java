package com.java8;

@FunctionalInterface
interface TestInterface {

	// abstract method
	public void square(int a);

	// default method
	default void show() {
		System.out.println("Default Method Executed");
	}
}

public class DefaultEx1 implements TestInterface {

	// implementation of square abstract method
	public void square(int a) {
		System.out.println(a * a);
	}

	public static void main(String args[]) {
		DefaultEx1 d = new DefaultEx1();
		d.square(4);

		// default method executed
		d.show();
	}
}