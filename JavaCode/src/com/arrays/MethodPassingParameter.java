package com.arrays;

public class MethodPassingParameter {
	
	public static void main(String[] args) {
		
		String [] verbs = {"go","run","play","walk"};
		printMessage(verbs);
	}
	
	public static  void printMessage(String [] words) {
		
		for(String w : words ) {
			System.out.println(w);
			
		}
	}
}

