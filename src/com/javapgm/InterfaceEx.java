package com.javapgm;

interface printable {
	void print();
	void hello();
}

public class InterfaceEx implements printable {
	
	public void print() {
		System.out.println("Printing..");
	}
	public void hello() {
		System.out.println("Hello..");
	}

	public static void main(String args[]) {
		InterfaceEx obj = new InterfaceEx();
		obj.print();
		obj.hello();
	}

	
}