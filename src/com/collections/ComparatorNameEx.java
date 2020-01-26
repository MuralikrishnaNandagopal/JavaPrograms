package com.collections;

import java.util.*;

@SuppressWarnings("rawtypes")
public class ComparatorNameEx implements Comparator {
	public int compare(Object o1, Object o2) {
		ComparatorStudentEx s1 = (ComparatorStudentEx) o1;
		ComparatorStudentEx s2 = (ComparatorStudentEx) o2;

		return s1.name.compareTo(s2.name);
	}
}