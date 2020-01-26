package com.exceptions;

class InvalidAgeException extends Exception{  
private static final long serialVersionUID = -3718175486621695274L;
InvalidAgeException(String s){  
	super(s);  
	}  
}  

public class UserExceptionEx1 {

	static void validate(int age) throws InvalidAgeException {
		if (age < 18)
			throw new InvalidAgeException("not valid");
		else
			System.out.println("welcome to vote");
	}

	public static void main(String args[]) {
		try {
			validate(1);
		} catch (Exception m) {
			System.out.println("Exception occured: " + m);
		}

		System.out.println("Continue the flow...");
	}
}