package com.abstractsConcepts;

public abstract class Honda {

	abstract void run();

}
class HondaVersion extends Honda{

	@Override
	void run() {
		System.out.println("hello this abstract method()");		
	}

}
