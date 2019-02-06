package com.clone;

class Student18 implements Cloneable{  
	int rollno;  
	String name;  

	Student18(int rollno,String name){  
		this.rollno=rollno;  
		this.name=name;  
	}  

	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
	}  

	
}  