package com.exceptionHandiling;

public class ThrowsAndThrow {


	public static void ageCheck(int age)throws InvalidAgeException {

		if(age<=0) {

			throw new InvalidAgeException("pleae give correct Age");
		}
		else {
			System.out.println("ur age is "+ age);
		}
	}
	public static void main(String[] args) {
		
	try {
		ageCheck(0);
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println("Exception Occured"+e);
	}

	}
}
