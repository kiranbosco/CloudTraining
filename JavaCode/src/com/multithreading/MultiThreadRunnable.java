package com.multithreading;

// if  ur not extended the thread class ur object would not be treated as the thread u need explicitly create the thread object and passing the object of implement the reference thread class
public class MultiThreadRunnable implements Runnable {

	@Override
	public void run() {
		
		System.out.println("this is the runnable interface method impliments");
		
	}
	public static void main(String[] args) {
		
		MultiThreadRunnable m = new MultiThreadRunnable();
		Thread t = new Thread(m);
		t.start();
	}

}
