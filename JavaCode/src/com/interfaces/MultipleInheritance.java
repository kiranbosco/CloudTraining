package com.interfaces;

public class MultipleInheritance {

	// Here is the ambiguity  problem now we call the mes() it will be getting the confusion which will call here	

	void mes() {
		System.out.println("this is the mess MultipleInheritance()");
	}
}
/*class B {
	void mes() {
		System.out.println("this is the B mes()");
	}
}

class C extends MultipleInheritance,B{

	public static void main(Strings [] args) {
		
	// Here is the ambiguity  problem now we call the mes() it will be getting the confusion which will call here	
		C obj = new C();
		c.mes();
		
	}
}
*/