package com.staticVSdynamicBinging;


class Animal {
	 
	void move() {
		System.out.println("animal move");
	}
	void show() {
		System.out.println("anima, show");
		
	}
	void disp() {
		System.out.println("animal disp");
		
	}
}
class Dog extends Animal{
	
	
	void move() {
		super.move();
		super.disp();
		super.show();
		System.out.println(" sub animal move");
	}
	void show() {
		System.out.println(" sub anima, show");
		
	}
	void disp() {
		System.out.println(" sub animal disp");
		
	}

	
}