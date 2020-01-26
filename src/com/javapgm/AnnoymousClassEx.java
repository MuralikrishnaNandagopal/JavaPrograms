package com.javapgm;

abstract class Person {
	abstract void eat();
}

public class AnnoymousClassEx {
	public static void main(String args[])
	{  
			Person p=new Person()
			{  
			void eat(){
				System.out.println("nice fruits");
			}  
	  };  
	  
	  p.eat();  
	 
	}
}


/*
 * static class TestAnonymousInner$1 extends Person  
{  
   TestAnonymousInner$1(){}  
   void eat()  
    {  
        System.out.println("nice fruits");  
    }  
}  
 * */

