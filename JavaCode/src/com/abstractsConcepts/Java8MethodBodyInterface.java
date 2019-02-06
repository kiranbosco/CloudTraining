package com.abstractsConcepts;

// in java8 version consist the method body in interfae lets see the example here
public interface Java8MethodBodyInterface{
	
	default void message() {
		System.out.println("i am consist the method body in java8");
		
	}
}
class MethodBody implements Java8MethodBodyInterface{
	
	public void draw() {
		System.out.println("this is the impliment the body in java 8 interface method()");
	}
	
}
