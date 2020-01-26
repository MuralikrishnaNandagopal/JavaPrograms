package com.exceptions;

public class ExceptionPropagationEx1 {
	void m() {
		int data = 50;
		System.out.println(data/0);
	}

	void n() {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String args[]) {
		ExceptionPropagationEx1 obj = new ExceptionPropagationEx1();
		obj.p();
		System.out.println("normal flow...");
	}
}