package com.interfaces;

public class Multlevel {
	
	void animal() {
		System.out.println("there are different kind of animals in  the world");
	}
}
class Cow extends Multlevel{
	
	void cows() {
		System.out.println("it is giving sound ambba");
	}
}

class Cat extends Cow{
	
	void cats() {
		System.out.println("it is giving sound miya");
	}
}
