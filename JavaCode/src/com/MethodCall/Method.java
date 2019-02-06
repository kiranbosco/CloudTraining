package com.MethodCall;

public class Method {
	
	public static void m() {
		
		System.out.println("this is  the static method() 1");
	}
	
	public void m1() {
	//	 m();  // Non static method  can call the static method()
		System.out.println("Non static method() 1");
	}

	public void m2() {
//		m1();  // Non static method can call the non static method()
		
		System.out.println("Non static Method() 2");
	}
	
	
	public static void m3() {
		m();  // can call the static method and another static method in java
	//	m2();    // Can't call the static method non static method()
		System.out.println(" this is the static method() 2");
	}
	
	
	
	public static void main(String[] args) {
		
	Method  obj = new Method();
//	obj.m1();
//	obj.m2();
	Method.m3();
	}
	
}
