package com.exceptionHandiling;

import java.io.IOException;


public class ExceptionOveriddenWithDecExcMethod {
	
	void message()throws IOException {
		
		System.out.println("this the super class Exception");
	}

}
class ExceptionSub extends ExceptionOveriddenWithDecExcMethod{
	
	void message() throws IOException{
	super.message();
		System.out.println("this is the sub class method()");
		
	}
	
}

