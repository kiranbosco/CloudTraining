package com.interfaces;

 public class InheritanceOverriding {

	void m() {

		System.out.println("i am super class method()");
	}

}
class Sub extends InheritanceOverriding{

	@Override

	void m() { // if ur change the method it will be effect for two class also

		System.out.println("i am super class method()");
	}
}