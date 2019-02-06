package com.multithreading;


// if ur calling the run method instead of start method it will be goes to current stack to new call stack
public class RunMethodCall extends Thread {

	public void run() {

		System.out.println("Q :- can we call run() instead of startMethod()  yes  but it will be goes current stack rather then to new call stack");
	}
	public static void main(String[] args) {
		
		RunMethodCall r = new RunMethodCall();
		r.run();

	}
}
