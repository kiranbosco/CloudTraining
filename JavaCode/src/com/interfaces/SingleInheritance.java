package com.interfaces;


// single inheritance is the given the features from one class to another class it is called as is relation ship in java
public class SingleInheritance {
	
	void  eating() {
		System.out.println("animal eating");
	}
	void sleeping() {
		System.out.println("animals sleeping");
	}
}
class Dog extends SingleInheritance{
	
	void bark() {
		System.out.println("dog is barking");
	}
	void running() {
		System.out.println("dog is running");
	}
}
