package com.compareTo;

public class Student implements Comparable<Student> {
	int rollno;  
	String name;  
	int age;  
	Student(int rollno,String name,int age){  
		this.rollno=rollno;  
		this.name=name;  
		this.age=age;  
	}
	@Override
	public int compareTo(Student stu) {
		if(age==stu.age) {
		return 0;
	}  
		else if(age>stu.age) 
			
		
		return 1;
		else 
			return -1;
	
	}
	
	
	
}  