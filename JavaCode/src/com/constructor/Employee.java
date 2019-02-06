package com.constructor;

public class Employee {
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
	int id;
	int age;
	String name;
	
	public Employee(int id) {
		this.id= id;
		
	}
	public Employee(int age,int id) {
		this(id);
		this.age= age;
		
	}
	public static void main(String[] args) {
		
		Employee emp = new Employee(10);
		System.out.println(emp);
		emp = new Employee(10,22);
	}

}
