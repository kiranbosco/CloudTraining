package com.blocks;


	class A{  
		A(){  
		System.out.println("parent class constructor invoked");  
		}  
		}  
		  
		class B3 extends A{  
		B3(){  
		super();  
		System.out.println("child class constructor invoked");  
		}  
		  
		B3(int a){  
		super();  
		System.out.println("child class constructor invoked "+a);  
		}  
		
		  
		{System.out.println("instance initializer block is invoked");}  
		  
		}

