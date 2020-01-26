package com.javapgm;

public class WrappingEx 
{ 
    public static void main(String args[]) 
    { 
        //  byte data type 
    	// wrapping around Byte object 
        byte a = 1; 
        Byte byteobj = new Byte(a); 
  
        
        // int data type 
        //wrapping around Integer object 
        int b = 10; 
        Integer intobj = new Integer(b); 
  
        
        // float data type 
        // wrapping around Float object 
        float c = 18.6f; 
        Float floatobj = new Float(c); 
  
        
        // double data type 
        // Wrapping around Double object 
        double d = 250.5; 
        Double doubleobj = new Double(d); 
  
        // char data type 
        // wrapping around Character object 
        char e='a'; 
        Character charobj=e; 
  
        //  printing the values from objects 
        System.out.println("Values of Wrapper objects (printing as objects)"); 
        System.out.println("Byte object byteobj:  " + byteobj); 
        System.out.println("Integer object intobj:  " + intobj); 
        System.out.println("Float object floatobj:  " + floatobj); 
        System.out.println("Double object doubleobj:  " + doubleobj); 
        System.out.println("Character object charobj:  " + charobj); 
        System.out.println("------------------------------------------");
        // objects to data types (retrieving data types from objects) 
        // unwrapping objects to primitive data types 
        byte bv = byteobj; 
        int iv = intobj; 
        float fv = floatobj; 
        double dv = doubleobj; 
        char cv = charobj; 
  
        // printing the values from data types 
        System.out.println("Unwrapped values (printing as data types)"); 
        System.out.println("byte value, bv: " + bv); 
        System.out.println("int value, iv: " + iv); 
        System.out.println("float value, fv: " + fv); 
        System.out.println("double value, dv: " + dv); 
        System.out.println("char value, cv: " + cv); 
    } 
} 