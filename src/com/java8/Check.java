package com.java8;


interface A {
		public static void print() {
			System.out.println("Checking...");
		}
	}
	
public class Check implements A {
			
	public static void main (String args[])
	{	
		A.print();
		Check c = new Check();
		c.print();
	}

	public void print() {
	System.out.println("Call in main method");
	}
}
