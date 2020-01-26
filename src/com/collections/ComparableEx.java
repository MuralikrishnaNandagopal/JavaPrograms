package com.collections;
import java.util.*;

public class ComparableEx 
{
	public static void main(String args[]) {

		ArrayList<ComparableStudentEx> al = new ArrayList<ComparableStudentEx>();
		al.add(new ComparableStudentEx(101, "Vijay", 23));
		al.add(new ComparableStudentEx(106, "Ajay", 27));
		al.add(new ComparableStudentEx(105, "Jai", 21));

		Collections.sort(al);
		for (ComparableStudentEx st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}