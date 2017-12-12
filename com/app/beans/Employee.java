package com.app.beans;

public class Employee {

	private int id;
	private String name;
	//define parameterised constructor
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
}
