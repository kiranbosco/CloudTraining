package com.scanner;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ur name");
		String name =sc.nextLine();

		System.out.println("Enter ur password");
		String pas =sc.nextLine();

		System.out.println("Enter ur id");
		int id =sc.nextInt();
		
		System.out.println("Enter ur salary");
		float sal =sc.nextFloat();
		System.out.println(name  + "  "  + pas + "  " + id  + " "  + sal);
		
		

	}

}
