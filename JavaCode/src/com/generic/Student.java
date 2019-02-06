package com.generic;

public class Student {
	
	int age;
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	int no;
	String name;
	
	@Override
	public String toString() {
		return "Student [age=" + age + ", no=" + no + ", name=" + name + "]";
	}


}
