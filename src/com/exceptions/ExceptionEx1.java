package com.exceptions;

public class ExceptionEx1 {
	@SuppressWarnings("null")
	public static void main(String args[]) {
			
		   try {
				int data = 100;
				System.out.println(data/0);
			} catch (ArithmeticException e) {
				System.out.println(e);
			}
		
		   System.out.println("rest of the code...");
	
			try {
				String s=null;  
				System.out.println(s.length());
			} catch (NullPointerException ne) {
				System.out.println(ne);
			}
			System.out.println("rest of the code...");
	
	}
}