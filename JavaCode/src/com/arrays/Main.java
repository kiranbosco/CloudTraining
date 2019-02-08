package com.arrays;

import com.interfaces.SingleInheritance;

@SuppressWarnings("unused")
public class Main {
	
	public static void main(String[] args) {
		SampleSingleTone object = SampleSingleTone.instance();
		object.m();
		
	}

}
