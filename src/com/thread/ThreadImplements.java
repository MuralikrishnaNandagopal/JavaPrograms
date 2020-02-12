package com.thread;

public class ThreadImplements  implements Runnable {

	public void run(){  
		System.out.println("thread is running in Implements method...");  
		}  
	
	public static void main(String args[]){  
		ThreadImplements m1=new ThreadImplements();  
		
		Thread t1 =new Thread(m1);  
		t1.start();  
		 }  
	
}
