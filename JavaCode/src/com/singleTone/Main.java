package com.singleTone;

public class Main {
	public static void main(String[] args) {
		SingleToneExe mysingle =SingleToneExe.instances();

		mysingle.disp();
		


		int a=10;  
		int b=5;  
		int c=20;  
		System.out.println(a>b&&b<c);//false && true = false  
		System.out.println(a<b&a<c);//false & true = false  


		System.out.println(a<b ||b<c);

	}

}
