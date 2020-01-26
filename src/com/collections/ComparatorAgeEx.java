package com.collections;

import java.util.*;

@SuppressWarnings("rawtypes")
public class ComparatorAgeEx implements Comparator 
{
	public int compare(Object o1, Object o2) {
		ComparatorStudentEx s1 = (ComparatorStudentEx) o1;
		ComparatorStudentEx s2 = (ComparatorStudentEx) o2;

		if (s1.age == s2.age)
			return 0;
		else if (s1.age > s2.age)
			return 1;
		else
			return -1;
	}
}