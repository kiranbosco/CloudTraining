package com.exceptionHandiling;

// Runtime exception at unchecked exception

public class JavaExceptionExample {
	public static void main(String[] args) {
		try {
			int i=100/0;

		}	
		catch (Exception e) {
			System.out.println(e);	
		}
	}

}
