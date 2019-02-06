package com.methodCalling;

public class StaticMethodCall {

/*	public void nonstaticmethod() {
		System.out.println("i not static method()");
	}
	*/
	public static void m() {
		System.out.println("i am static method()");
	}

	public static void m1() {
		m();
	//	nonstaticmethod();  can't make the nonstatic method in static method()
		System.out.println("i am first static method()");

	}
	public void nonstaticmethod() {
		m1();

		System.out.println("i not static method()");
	}
	
	public void nonstaticmethod1() {
	//	m1();
		nonstaticmethod();

		System.out.println("i not static method1()");
	}
	
	public static void main(String[] args) {

	//	StaticMethodCall.m1();
		
		StaticMethodCall s = new StaticMethodCall();
		s.nonstaticmethod1();
	}
	
}

