package com.javapgm;

abstract class Bank {
	abstract int getRateOfInterest();
	
	public String print() {
		return "Print Service";
	};
	
	public static String checker() {
		return "Static Check";
	}
	
}

class SBI extends Bank {
	int getRateOfInterest() {
		return 7;
	}
	
	public String print() {
		return "SBI Print Service";
	}
	
	public static String checker() {
		return "SBI Static Check";
	}
}

class PNB extends Bank {
	int getRateOfInterest() {
		return 8;
	}
}

public class AbstractClassEx {
	public static void main(String args[]) {
		Bank b;
	
		b = new SBI();
		System.out.println("Rate of Interest in SBI is: " + b.getRateOfInterest() + " %");
		System.out.println("Checking Non Abstract Method : " + b.print()); 
		System.out.println("Checking Non Abstract Method : " + Bank.checker()); 

		
		b = new PNB();
		System.out.println("Rate of Interest in PNB is: " + b.getRateOfInterest() + " %");
		System.out.println("Checking Non Abstract Method : " + b.print()); 
	}
}