package com.basic;

import java.util.Scanner;

public class CheckEvenOrOdd {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value");
		int num =s.nextInt();
		
		if(num % 2==0) {
			System.out.println("this is the even number");
		}
		else {
			System.out.println("odd num");
		}
	}

}
