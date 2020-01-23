package com.collections;

import java.util.*;


@SuppressWarnings("rawtypes")
public class DequeueEx {
	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Gautam");
		deque.add("Karan");
		deque.add("Ajay");
		
		deque.add("Element 1 (Tail)"); 
        deque.addFirst("Element 2 (Head)"); 
        deque.addLast("Element 3 (Tail)"); 
        
        deque.push("Element 4 (Head)"); 
        deque.offer("Element 5 (Tail)"); 
        deque.offerFirst("Element 6 (Head)"); 
        deque.offerLast("Element 7 (Tail)");

		for (String str : deque) {
			System.out.println(str);
		}
		
		
		Iterator reverse = deque.descendingIterator(); 
        System.out.println("Reverse Iterator"); 
        while (reverse.hasNext()) 
            System.out.println("\t" + reverse.next()); 
        
        
        System.out.println("Peek " + deque.peek()); 
        System.out.println("After peek: " + deque); 
        System.out.println("Pop " + deque.pop()); 
        System.out.println("After pop: " + deque); 
	}
}