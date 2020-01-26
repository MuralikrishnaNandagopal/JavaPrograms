package com.javapgm;

import com.java8.Check;

public class Test {
	
	public static void main (String args[]) {

	Object result1 = Check.getObject(); 
	System.out.println(result1);
	
	
    Check provider = new Check();
    String result2 = provider.getArray();
	System.out.println(result2);

	}
}
