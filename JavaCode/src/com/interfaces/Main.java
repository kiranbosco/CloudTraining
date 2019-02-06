package com.interfaces;

public class Main {
	public static void main(String[] args) {
		
		// this is the single inheritance process
	Dog d = new Dog();
	d.bark();
	d.eating();
	d.sleeping();
	d.running();
		
	System.out.println();
	
	// Multilevel inheritance process
	
	
	Cat c = new Cat();
	c.animal();
	c.cows();
	c.cats();
	
	System.out.println();
	// Hierarchil Inheritance

	// Heare i create the relation only 
		Donky dnk = new Donky();
		Monky ds = new Monky();
		ds.monkys();
	
		dnk.donkys();
		dnk.eat();
	
	}
}
 

