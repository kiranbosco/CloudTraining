package com.arrays;

public class MethodPssArr {

	static String verbs [] = {"go","run","walk","drink",};
	static int num[] = {10,45052,3,4,0,5,5,8};

	public void printMessage(String [] words) {
		for(String w : words) {
			System.out.println(w);
		}
			}
	public void disp(int [] digits) {
		for(int x :  digits) {
			System.out.println(x);
		}
	}
	public static void main(String[] args) {
		
		MethodPssArr m = new MethodPssArr();
		m.printMessage(verbs);
		m.disp(num);

	}
	

}
