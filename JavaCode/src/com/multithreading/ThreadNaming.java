package com.multithreading;

public class ThreadNaming extends Thread {

	public void run() {

	//	Thread.currentThread().getName();
		System.out.println(Thread.currentThread().getName());

	}
	public static void main(String[] args) {
 
		ThreadNaming t = new ThreadNaming();
		ThreadNaming t1 = new ThreadNaming();
		ThreadNaming t2= new ThreadNaming();
		ThreadNaming t3 = new ThreadNaming();

		t.start();
		t1.start();
		t2.start();
		t3.start();
		
	}

}
