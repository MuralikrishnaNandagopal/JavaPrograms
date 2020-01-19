package com.javapgm;


public class ConstructorParams {
	  int x;

	  public ConstructorParams(int y) {
	    x = y;
	  }

	  public static void main(String[] args) {
	    ConstructorParams myObj = new ConstructorParams(15);
	    System.out.println(myObj.x);
	  }
	}