package com.singleTone;


public class SingleToneExe {
	
	// this static instanations given to goloble access to calss to referece of an object
	private static SingleToneExe  obj =null;
	
	private SingleToneExe() {
		
		// this constructor is used to stop the values to outside  
	}
	// instance
	public static  SingleToneExe instances () {
		
		if(obj ==null) {
			obj = new SingleToneExe();
		}
		
		return obj;
		
	}
	
	void disp() {
		System.out.println("hello");
	}
	

}
