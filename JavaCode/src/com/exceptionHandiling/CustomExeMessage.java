package com.exceptionHandiling;

public class CustomExeMessage {
	public static void main(String[] args) {

		try {
			int i=50/0;
		}
		catch (Exception e) {
			System.out.println("you cont able devided by zero");
		}
		
		// Custom message solution
		
		int i =50;
		int j =0;
		int data;
		try {
		
			data =i/j;
			
		}
		catch (Exception e) {
			
			System.out.println(i/(j+2));
		}
		
		// ArrayIndexOutOfBoundsException 
		
		try {
		int k [] = {1,5,3,6,4};
		System.out.println(k[10]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("this is the Out of memory exception");
			
		}
		
	}

}
