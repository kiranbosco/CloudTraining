package com.abstractsConcepts;

public abstract class Honda { //cant declared any  final keyword in abstract class

	abstract void run();

}
class HondaVersion extends Honda{

	@Override
	void run() {
		System.out.println("hello this abstract method()");		
	}

}
