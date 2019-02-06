package com.comparator;

public class Student {
	
	int id;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	
	
	}

	