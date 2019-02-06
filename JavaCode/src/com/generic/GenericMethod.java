package com.generic;

import javax.swing.JTable.PrintMode;

// Generic method that can accept the any type of orgments
public class GenericMethod {

	public static void main(String[] args) {
		
		Integer [] array= {8,9,5,4,7,8,4,8};
		char [] ch = {'k','i','r','a','n'};
		
		
		PrintMe(array);
		PrintMe(ch);


	}

	private static void PrintMe(char[] ch) {

		for(Character c : ch) {
			System.out.println(c);
		}
		
	}

	private static void PrintMe(Integer[] array) {
		for(Integer i : array) {
			System.out.println(i);
		}
		System.out.println();
		
	}
}
