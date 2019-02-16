package com.unit;

public class Demo {

	public boolean compareToString(String first , String secound) {

		if(first.equalsIgnoreCase(secound)) {
			return true;
		}
		else {

			return false;
		}
	}


	public void concatStirng(String  firstName ,String second) {

		firstName.concat(second);

	}
	
	/*
	 * public int [] addOneVal(int [] number) {
	 * 
	 * int val = number.length; int output [] = new int [val]; for(int i=0;
	 * i<val;i++) {
	 * 
	 * output [i] =number[i]+2; } return output;
	 * 
	 * }
	 */
		
		public int [] addOneVals(int [] number) {
			
			int val = number.length;
			for(int i=0; i<val;i++) {
				
				number[i]= number[i]+2;
				}
			return number;
}
}
