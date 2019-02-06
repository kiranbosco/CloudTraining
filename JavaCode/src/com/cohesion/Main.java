package com.cohesion;


class Display { 
	public static void main(String[] args) 
	{ 
		Name n = new Name(); 
      System.out.println(n.getName("Geeksforgeeks")); 
      Age a = new Age(); 
      System.out.println(a.getAge(10)); 
      Number no = new Number(); 
      System.out.println(no.getNumber(1234567891)); 


	} 
}