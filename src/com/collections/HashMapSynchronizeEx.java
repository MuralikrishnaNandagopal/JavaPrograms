package com.collections;

import java.util.*;

@SuppressWarnings("rawtypes")
public class HashMapSynchronizeEx {
   
	
	public static void main(String args[]) {
       
   // Creating a HashMap of Integer keys and String values
   HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
   hashmap.put(1, "Murali");
   hashmap.put(2, "Dheeran");
   hashmap.put(3, "Swathi");
   hashmap.put(4, "Nandhu");
   hashmap.put(5, "Dhoni");
   
   hashmap.entrySet().forEach(entry->{
	    System.out.println(entry.getKey() + " " + entry.getValue());  
	 });
   
   Map map= Collections.synchronizedMap(hashmap);
   Set set = map.entrySet();
   
   synchronized(map){
       Iterator i = set.iterator();
       
       while(i.hasNext()) {
           Map.Entry pair = (Map.Entry)i.next();
           System.out.print(pair.getKey() + ": ");
           System.out.println(pair.getValue());
       }
   }
 }
}