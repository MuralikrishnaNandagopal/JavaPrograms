package com.collections;

import java.util.*;

public class LinkedListEx {

	public static void main(String args[]) {

		LinkedList<String> al1 = new LinkedList<String>();
		al1.add("Ravi");
		al1.add("Vijay");
		al1.add("Ravi");
		al1.add("Ajay");
		al1.add(1,"Murali");
		
		LinkedList<String> al2 = new LinkedList<String>();
		al2.add("Dhoni");
		al2.add("Virat");
		al2.addFirst("KapilDev");
		al2.addLast("AamirKhan");
		
		al1.removeFirstOccurrence("Ravi");
		al1.addAll(0,al2);

		Iterator<String> itr = al1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(al1.toArray()[0]);
		al1.clear();
		System.out.println(al1);
		
	}
}