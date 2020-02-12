package com.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LambdaCollections {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3);
		
		// Conventional way of printing arraylist
		for (int number : numbers) {
					//System.out.print(number+ "\n");
		}
		System.out.print("Printing in normal For Loop \n");
		
		//numbers.forEach((Integer value) -> System.out.print(value+"\n"));
		//numbers.forEach(value -> System.out.print(value+"\n"));
		//numbers.forEach(System.out::print);
		
		
		
		//Hash Map Print Using Java8
		Map<String, Integer> map = new HashMap<>();
			map.put("Apple", 10);
		    map.put("Motorolla", 20);
		    map.put("RealMe", 30);
		    map.put("Oppo", 40);
		    map.put("Sony", 50);
		    map.put("OnePlus", 60);
		    map.forEach((K,V) -> System.out.println("Brand : "+ K + ", Stock : " + V));
		
		
		
	}

}
