package com.javapgm;

 class FinalEx {
 
	 //Final Method 
	 class Bike {  
	 final void run(){System.out.println("running");}  
	 }  
	 
	/*
	 * class Honda extends Bike{ void run(){
	 * System.out.println("running safely with 100kmph");} }
	 */
	
	
		 
	// Final Variable 	 
	final int speedlimit=90;
	/*  private void run() { speedlimit = 90; } */
	 
	public static void main(String args[])
	{  
		FinalEx obj=new  FinalEx();  
		System.out.println(obj.speedlimit);
	}
	
	
	//Final Class 
	/*
	 * final class Bike{ }
	 * 
	 * class Honda1 extends Bike{ void
	 * run(){System.out.println("running safely with 100kmph"); } }
	 */
	

}
