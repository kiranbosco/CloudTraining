package com.udimy;

public class RunableIntefaceJava8 {

	public static void main(String[] args) {

		//Imparative Style 7

		Runnable runable = new Runnable() {

			@Override
			public void run() {
				System.out.println("Inside Run method");				
			}
		};
		new Thread(runable).start();
		
		//Declarative Style 8 
		
		// if ur write the single line in java 8 code no need to write body in java8
		
		Runnable runLambda =()->{
			System.out.println("Inside Run Method  8");
		};
		
		Runnable runableSingleLine =()->System.out.println("Runable single line code");
		
		new Thread(runLambda).start();
		new Thread(runableSingleLine).start();
		new Thread(()->System.out.println("Directly call the lambda in thread class")).start();
	}
}
