package com.exceptionHandiling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

//java CompileTime Exception  
public class CheckedException {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {
		try {
		PrintWriter pw;
		pw = new PrintWriter("jpt.txt");
		pw.println("save");
		}
		catch (FileNotFoundException e) {
			System.out.println(e);
		}
		System.out.println("file saved successfully");
		
	}

}
