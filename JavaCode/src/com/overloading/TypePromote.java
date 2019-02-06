package com.overloading;

public class TypePromote {

	int sum (int a, int b) {
		
		System.out.println("Integer Type Promote");
		return a+b;
	}
	
	float sum(float a, float b) {
		
		System.out.println("Float Type Promote");

		return a+b;
	}
	
	public static void main(String[] args) {
		
		TypePromote t = new TypePromote();
		
		System.out.println(t.sum('a', 5.5f)); // Type promotion
		System.out.println(t.sum(10, 'k')); // Type Promotion
	}
}
