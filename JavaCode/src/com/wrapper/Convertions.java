package com.wrapper;

// Conver the primitive into object object into primitive data using valueOf method() or parase method()
@SuppressWarnings("static-access")
public class Convertions {
	public static void main(String[] args) {
		
	int x =10;
	Integer i = Integer.valueOf(x);
	System.out.println(i);
	
	Integer xx = new Integer(20);
	int xi =xx.valueOf(xx);
	System.out.println(xi);
	
	String str ="1000";
	int xtr =Integer.valueOf(str);
	System.out.println(xtr);
	
	String st ="150.f";
	float f =Float.valueOf(st);
	System.out.println(f);
	
	String std ="Objects of java";
	Object obj = std.valueOf(std);
	System.out.println(obj);
	
	
	float fss = 105.f;
	String strg =String.valueOf(fss);
	System.out.println(strg);
	
/*	String num ="500A";    // Number formate exception in java
	int n =Integer.valueOf(num);
	System.out.println(n);
	*/
	}
	

}