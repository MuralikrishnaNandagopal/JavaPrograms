package com.javapgm;

public class ContinueEx {

	   public static void main(String args[]) {
	      int [] numbers = {10, 20, 30, 40, 50};

	      for(int x : numbers ) {
	         if( x == 30 ) {
	        	 System.out.println("Came here when : " + x);
	            continue;
	         }
	         System.out.print( x );
	         System.out.print("\n");
	      }
	   }
	}