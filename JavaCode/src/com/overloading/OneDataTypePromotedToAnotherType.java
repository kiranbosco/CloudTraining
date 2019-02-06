package com.overloading;

public class OneDataTypePromotedToAnotherType {
	
 void sum(int a, long b) {
	 
	 System.out.println(a+b);
 }
void  sum(int a, int b, int c) {
	
	System.out.println(a+b+c);
}
public static void main(String[] args) {
	
	OneDataTypePromotedToAnotherType o = new OneDataTypePromotedToAnotherType();
	o.sum(10, 20);
	o.sum(2, 4, 6);
	
}
}
