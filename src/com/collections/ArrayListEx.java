package com.collections;

import java.util.*; 

public class ArrayListEx{  
	
@SuppressWarnings("rawtypes")
public static void main(String args[])
{  

	ArrayList<String> list=new ArrayList<String>();   
     list.add("Ravi");    
     list.add("Vijay");    
     list.add("Ravi");    
     list.add("Ajay");   
     list.add("");
     
     
     System.out.println("Printing Entire List -> " + list);  

     System.out.println("Printing Entire List as Array -> " + list.toArray()[1]);  
     
     
     Iterator itr=list.iterator();  
     
     while(itr.hasNext()){  
      System.out.println("Printing Entire List as Iterator -> " + itr.next());  
     }  
 }  
}  
