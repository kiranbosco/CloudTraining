package com.interfaces;

// Heare is  i create the relation object only Hierachal class and Donky class but not Monky class
public class Hierarchical {
	
	void eat() {
		
		System.out.println("this ist the eat method()");
	}
}


class Donky extends Hierarchical{
	
	void donkys() {
		System.out.println("this is the donkys method()");
	}
}
class Monky extends Hierarchical{
	void monkys() {
		System.out.println("this is the monkey folders()");
	}
}