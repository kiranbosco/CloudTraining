package com.abstracts;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public abstract class Initiate {

	void m() {
		System.out.println("What will be happen");
	}
	public static void main(String[] args) {

	//	Initiate i = new Initiate() ;
			
		
		// In an abstract class can'b create the object or initiate directly
		TreeSet< String> s = new TreeSet<>();
		s.add("k");
		s.add("p");
		s.add("y");		
		s.add("kt");
		
		s.remove("kt");
	
		System.out.println(s);
		
	}
}
