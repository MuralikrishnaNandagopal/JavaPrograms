package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;




public class Test {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		ArrayList<String> list=new ArrayList<String>();   
		list.add("Tiger");
		list.add("Lion");
		list.add("Lion");
		list.add("Lion");
		list.add("Lion");
		list.add("Dog");
		list.add("Dog");

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		int counter=1;
		
		for(int i = 0; i < list.size(); i++) {   
			String name = list.get(i);
		  		
		    if (hm.containsKey(name)) {
		    	hm.put(name, hm.get(name)+1);
		    }
		    else {
		    	hm.put(name,counter);
		    }
		} 
		
		 for(Map.Entry m:hm.entrySet()){    
	           System.out.println(m.getKey()+" "+m.getValue());    
	          }    
		
	}

}
