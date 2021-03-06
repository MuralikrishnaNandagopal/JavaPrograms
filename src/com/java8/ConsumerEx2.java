package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerEx2 {
	
	   static void addList(List<Integer> list) {
		
		 // Return sum of list values
		int result = list.stream()
								  .peek(Integer -> System.out.println(Integer))
								  .mapToInt(Integer::intValue)
								  .peek(Integer -> System.out.println(Integer))
								  .sum();
		System.out.println("Sum of list values: " + result);
	
	   }

	public static void main(String[] args) {
		
		// Creating a list and adding values
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		// Referring method to String type Consumer interface
		Consumer<List<Integer>> consumer = ConsumerEx2::addList;
		consumer.accept(list); // Calling Consumer method

	}
}