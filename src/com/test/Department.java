package com.test;

import java.util.LinkedList;

public class Department {
	
	public static void main (String args[]) {
		
		Employee ee1 = new Employee(100, "Murali");
		Employee ee2 = new Employee(100, "Murali");
		
		System.out.println("Check Both objects are equal or not : " + ee1.equals(ee2));
		
		LinkedList<Employee> al1 = new LinkedList<Employee>();
		al1.add(ee1);
		al1.add(ee2);
		
		System.out.println("Size of the list : " + al1.size());
		
		
		String s1 = "Murali";
		String s2 = "MuraliK";
		
		s1 = s2;
		
		System.out.println("Check Both string are equal or not : " + s1.equals(s2));
		
		
		
	}

}
