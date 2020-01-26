package com.java8;

interface TestInterface1 
{ 
    // default method 
    default void show() 
    { 
        System.out.println("Default TestInterface1"); 
    } 
} 
  
interface TestInterface2 
{ 
    // Default method 
    default void show() 
    { 
        System.out.println("Default TestInterface2"); 
    } 
} 
  
// Implementation class code 
public class DefaultEx2 implements TestInterface1, TestInterface2 
{ 
    // Overriding default show method 
    public void show() 
    { 
    	TestInterface1.super.show(); 
        TestInterface2.super.show(); 
    } 
  
    public static void main(String args[]) 
    { 
        DefaultEx2 d = new DefaultEx2(); 
        d.show(); 
    } 
}