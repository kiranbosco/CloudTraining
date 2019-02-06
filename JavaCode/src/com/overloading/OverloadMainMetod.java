package com.overloading;

//Question :- can we overload the main method in java
 // yes we can overload the n number of main method in java
public class OverloadMainMetod {
	
	public static void main(String[] args) {
		System.out.println("main string[] args");
	}
	public static void main(String args)
	
	{
		System.out.println("main with String");
	}  
	public static void main1(String[] kiran) {
		System.out.println(" this  is the kiran");
		
	}
	public static void main2(String[] args) {
		System.out.println("this is the vijay");
	}
}
	

//Note : - we can call the N number of main method but  jvm calls only once in main method in java
