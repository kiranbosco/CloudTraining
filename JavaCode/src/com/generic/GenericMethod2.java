package com.generic;

import java.util.Iterator;

// in this generic method can accept any type of data or(Orgments)
public class GenericMethod2 {
	
	private static void printEmployee(Employee e) {
		}


	private static void printStudent(Student stu) {
	}

	
	public static void main(String[] args) {
		
		Student stu = new Student();
		stu.setAge(10);
		stu.setName("Rishi");
		stu.setNo(55);
		System.out.println(stu.getAge() + " "+ stu.getName() +  " "+ stu.getNo());
		
		
		
		Employee e = new Employee();
		e.setEmpId(1256);
		e.setEmpName("Kiran");
		e.setEmpSal(60000);
		
		System.out.println(e.getEmpId() + " "+ e.getEmpName()+ " "+ e.getEmpSal());
		
		
		printStudent(stu);
		printEmployee(e);
		
	}

	
}
