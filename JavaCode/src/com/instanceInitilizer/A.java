package com.instanceInitilizer;


public class A {
	
	public A() {

	System.out.println("Super class constructor()");
	}
}

class B extends A{
	
	public B() {
		super();

		System.out.println("Sub class Constructor()");
}
	{
		System.out.println("This is the initilizer block()");
	}
	
	
}
