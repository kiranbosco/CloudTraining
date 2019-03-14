package com.Functions;

public class FunctionExe1 {
	
	// function can be using reusability functionality and more  readability and reusability
	
	public static String performConcat(String str) {
		
		return FunctionExample.andThenMethod.apply(str);
		
	}
	
	
	public static void main(String[] args) {
	
		String result =performConcat("kiran kumar");
		System.out.println("Result is " + result);
		
	}

}
