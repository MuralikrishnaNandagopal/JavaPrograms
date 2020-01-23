package com.java8;

import java.util.StringJoiner;

public class StringJoinerEx 
{
	public static void main(String[] args) {
	StringJoiner joinNames = new StringJoiner(","); 

	// Adding values to StringJoiner
	joinNames.add("Rahul");
	joinNames.add("Raju");
	joinNames.add("Peter");
	joinNames.add("Raheem");

	System.out.println(joinNames);
	
	}
}