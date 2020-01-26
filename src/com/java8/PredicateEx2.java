package com.java8;

import java.util.function.Predicate;

public class PredicateEx2 {
	
	static Boolean checkAge(int age) {
		if (age > 17)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
	
		Predicate<Integer> predicate = PredicateEx2::checkAge;  	// Using Predicate interface
		
		boolean result = predicate.test(22); // Calling Predicate method
		
		System.out.println(result);
	}
}