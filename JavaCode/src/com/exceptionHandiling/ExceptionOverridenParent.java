/*package com.exceptionHandiling;


// NOTE:- if Super class doesNot declared any exception Can't declared subclass overridden metod() checked Exception but it can be unchecked Exception 
import java.io.IOException;

public class ExceptionOverridenParent {
	
	void message() {
		System.out.println("this is the super class method()");
	}
}
class SubCLassException extends ExceptionOverridenParent {
	
	void message() throws IOException {
		
		System.out.println("this is the subclass()");
	}
	public static void main(String[] args) {
		
		ExceptionOverridenParent e = new ExceptionOverridenParent();
		e.message();
		
	}
}
*/