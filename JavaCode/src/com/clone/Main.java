package com.clone;

public class Main {

	public static void main(String args[]){  
		try{  
			Student18 s1=new Student18(101,"kiran");  

			Student18 s2=(Student18)s1.clone();  

			System.out.println(s1.rollno+" "+s1.name);  
			System.out.println(s2.rollno+" "+s2.name);  

		}catch(CloneNotSupportedException c){}  

	}  
}
