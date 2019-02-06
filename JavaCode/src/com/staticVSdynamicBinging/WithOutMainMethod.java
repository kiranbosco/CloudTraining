package com.staticVSdynamicBinging;

  class WithOutMainMethod {
	public static void main(String[] args) { // up to 1.6 it was  possible  from 1.7 must and should be use main method()
		
	}
	
	static {
		
		System.out.println(" i am static method()");
	}

}
