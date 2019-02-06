package com.collections;

public class GetEmployee {

	String name;
	int id;
	String lname;
	
	@Override
	public String toString() {
		return "GetEmployee [name=" + name + ", id=" + id + ", lname=" + lname + "]";
	}


	public GetEmployee(String name, int id, String lname) {
		super();
		this.name = name;
		this.id = id;
		this.lname = lname;
	}
	
}
