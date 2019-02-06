package com.basic;

public class AndOperator {
	public static void main(String[] args) {
		
	 	int  val =100;
	 	int vals =50;
	 	int finalVal =75;
	 	
	 	if(val > vals && vals<finalVal) {
	 		System.out.println("val is the greter vals");
	 		
	 	}
	 	else {
	 		System.out.println("val is the less ");
	 	}
	 	
	 	
	 	// or one more example
	 	
	 	// this || condition does not check the second condition if first condition true  
	 	if(val < vals || finalVal<vals) {
	 		System.out.println("the value is the geter 50");
	 		
	 	}
	 	else {
	 		System.out.println("both are rong");
	 	}
		
	}
}
