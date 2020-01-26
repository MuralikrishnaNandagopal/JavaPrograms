package com.java8;

interface Sayablee{  
    public String say(String name);  
}  
  
public class LambdaEx2{  
    public static void main(String[] args) {  
      
        // Lambda expression with single parameter.  
    	Sayablee s1=(name)->{   return "Hello, "+name;     };  
        System.out.println(s1.say("Sonoo"));  
          
         
        Sayablee s2= name ->{  return "Hello, "+name;  };  
        System.out.println(s2.say("Sonoo"));  
    }  
}  