package com.java8;

interface Test1 
	{ 
	     public static int square(int a) {
	    	 return a*a;
	     };
		
	     // default method 
	    default void show() 
	    { 
	        System.out.println("Default TestInterface1"); 
	    } 
	} 
	  
interface Test2 
	{ 
	    
	/*
	 * public static int square(int a) { return a*a*a; };
	 */
		
		// Default method 
	    default void show() 
	    { 
	        System.out.println("Default TestInterface2"); 
	    } 
	} 
	  
	// Implementation class code 
public class DefaultEx3 implements Test1, Test2 
	{ 
	   
	    @Override
		public void show() {
			Test2.super.show();
			Test1.super.show();
		}

	
	    /* public void square(int a) { System.out.println(a); } */
	    /* public static int square(int a) { return a; } */
	  
	 		public static void main(String args[]) 
	    { 
	        DefaultEx3 d = new DefaultEx3(); 
	        d.show(); 
	        Test1.square(10);
	    }

	

}
