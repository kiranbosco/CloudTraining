package com.interfaces;

import java.io.IOException;

public class OverrideMethod {

	public static void  foo(){
		System.out.println("Foo method()");
	}

	public static void foo(int a) {
		System.out.println("Foo m");
	}
	public static void main(String[] args) throws IOException {

	 OverrideMethod.foo();
	 OverrideMethod.foo('c');
}
} 