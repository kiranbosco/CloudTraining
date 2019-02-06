package com.abstractsConcepts;

public interface InterfaceExtends extends MultipleINh{
	
	void print();
}

class Test implements InterfaceExtends{

	@Override
	public void show() {

		System.out.println("interface impliments show()");
	}

	@Override
	public void print() {

System.out.println("interface impliment primt metho()");
		
	}
	
}
