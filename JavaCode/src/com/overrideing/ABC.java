package com.overrideing;

public class ABC {
	
		   //Overridden method
		   public void disp()
		   {
			System.out.println("disp() method of parent class");
		   }	   
		}
		class Demo extends ABC{
		   //Overriding method
		   public void disp(){
			System.out.println("disp() method of Child class");
		   }
		   
		}