package com.override;

public class Vehicle {
	
	void run() {
		System.out.println("this is the override base method");
	}
}
class Bick extends Vehicle{
	
	void run() {
	//	super.run();
		System.out.println("this is  the sub class override method in java");
	System.out.println(" impliment  different functionality in this methoe");
	}
	
}
