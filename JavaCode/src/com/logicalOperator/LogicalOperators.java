package com.logicalOperator;

public class LogicalOperators {
	public static void main(String[] args) {
		
		
		int one =10;
		System.out.println(++ one); // preincrement 11
		System.out.println(one++); // postincrement 11
		System.out.println(one); // final value 12
		
		System.out.println(-- one); // predecrement
		System.out.println(one --); //post decrement
		System.out.println(one);

		//Logical Operators  
	//	if condition one is fail it will never check the secoud conditio 
		
		int a =100;
		int b =15;
		int c=150;
		
		if(a<b && b<c) {
			System.out.println("B  less value");
			
		}
		else {
			System.out.println("B is big values");
		}
	   
		
		if(b<a || a<b) {
			System.out.println(" A is Big value");
		}
		else {
			System.out.println("B less");
		}
		
		if(a<b || b<a && c<a || b<c) {
			System.out.println("third condition  a is big");
		}
		else {
			System.out.println("third condition b is less");
		}
		
		
		int x =10;
		int y =20;
		x+=4+5-3*2-10+5/2+10;
	
		System.out.println(x);
	}
}

