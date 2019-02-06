package com.override;


public class DMDMultiLevel {
	void disp() {
		System.out.println("this base");
	}
}
class Sub extends DMDMultiLevel{
	void disp() {
		
		System.out.println("this is the sub");
	}
}
class Sub1 extends Sub{
	void disp() {
		System.out.println("this is the sub1");
	}
}
class Sub2 extends Sub1{
	void dips() {
		
	}
}