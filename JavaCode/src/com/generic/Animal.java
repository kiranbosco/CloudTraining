package com.generic;

class Animal {
	String name;
	Animal(String name) { 
		this.name = name;
	}

	public String toString() { 
		return name;
	}
}

class Cat extends Animal { 
	Cat(String name) {
		super(name);
	}
}

class RedCat extends Cat {
	RedCat(String name) {
		super(name);
	}
}

class Dog extends Animal {
	Dog(String name) {
		super(name);
	}
}