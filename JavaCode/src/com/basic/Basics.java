package com.basic;


public class Basics {
	public static void main(String[] args) {
		
		// Withe extra empty varable 
		
		int x =10;
		int y =20;
		int temp ;
		
		temp = x;
		x =y;
		y=temp;
		
		System.out.println(x + "x value is now");
		System.out.println( y + " y value is now");
		
		
		//with out the extra variable use 
		
		x = x+y; //30
		y =x-y ; //10;
		x = x-y;
		
		System.out.println(x  + "  with out third party value " );
		System.out.println( y + "  wiht out third pary value  ");
		
		System.out.println();
		
		int emp =100;
		for(int j=45; j<emp-50;j++) {
			System.out.println(j);
		}
		
		
		}
		
	}
