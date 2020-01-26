package com.collections;

import java.util.*;


@SuppressWarnings({ "unchecked", "rawtypes" })
public class ComparatorSimpleEx {

	public static void main(String args[]) {

		ArrayList al = new ArrayList();
		al.add(new ComparatorStudentEx(101, "Vijay", 23));
		al.add(new ComparatorStudentEx(106, "Ajay", 27));
		al.add(new ComparatorStudentEx(105, "Jai", 21));

		System.out.println("Sorting by Name");

		Collections.sort(al, new ComparatorNameEx());
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			ComparatorStudentEx st = (ComparatorStudentEx) itr.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

		System.out.println("Sorting by age");

		Collections.sort(al, new ComparatorAgeEx());
		Iterator itr2 = al.iterator();
		while (itr2.hasNext()) {
			ComparatorStudentEx st = (ComparatorStudentEx) itr2.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}
}