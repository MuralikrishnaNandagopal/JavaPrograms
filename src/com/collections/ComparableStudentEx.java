package com.collections;

class ComparableStudentEx implements Comparable<ComparableStudentEx> {
	int rollno;
	String name;
	int age;

	ComparableStudentEx(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int compareTo(ComparableStudentEx st) {
		if (age == st.age)
			return 0;
		else if (age < st.age)
			return 1;
		else
			return -1;
	}
}