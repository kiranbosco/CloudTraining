package com.abstractsConcepts;

// it can hava abstract method and non abstract method and constructors and static metods also
public abstract class Bick {
	// Consturctor

	public Bick() {
		System.out.println("this is the Bick constructor method");
	}

	abstract void run();
	void changeGare() {
		System.out.println("change the gare ");
	}
}
class Car extends  Bick{

	@Override
	void run() {

		System.out.println("this is the Base class abstract method overridden to sub class");
	}
	
}

