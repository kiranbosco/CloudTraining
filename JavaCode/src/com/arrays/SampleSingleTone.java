package com.arrays;

public class SampleSingleTone {

	//instanations
	private static SampleSingleTone obj=null;

	// private constructor

	private SampleSingleTone() {

	}
	public static SampleSingleTone instance() {

		if(obj ==null) {
			obj= new SampleSingleTone();
		}
		return obj;

	}

	public void m() {
		System.out.println("Hello");
	}
}
