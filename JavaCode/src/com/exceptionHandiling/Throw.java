package com.exceptionHandiling;

import java.util.Scanner;

public class Throw {
	
	
	int atempt =0;
	Scanner s = new Scanner(System.in);
	
	
	public static  void getAge(int age) {
		if(age< 18) {
			throw new ArithmeticException("Sorry ur not eligible for the voting ");
		}
		else {
			System.out.println("welcome to you");
		}
		}
	public static void checkPinNum(int pin) {
		
		
		

	}
	public static void main(String[] args) {
		
		Throw.getAge(17);
	}
	}
