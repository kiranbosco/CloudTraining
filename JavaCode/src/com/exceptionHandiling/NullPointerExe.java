package com.exceptionHandiling;

public class NullPointerExe {
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		
		try {
		String name =null;
		System.out.println(name.length());
		}
		catch (Exception e) {
		//	System.out.println("Arthimatic Exception Occured");
			System.out.println(e);
		}
	}

}
