package com.test;

public class Employee {
	
	public Employee(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	private int id; 
	private String name;
	
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	

}
