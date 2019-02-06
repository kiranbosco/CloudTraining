package com.interfaces;

// [Is a relation ship]
class Employee{  
	
float salary =40000.f;

	} 
class Programer extends Employee{
	
	
	int bonus =10000;

	public static void main(String[] args) {
		Programer p  = new Programer();
System.out.println(p.salary + ""+  p.bonus);		
	

	}
}

