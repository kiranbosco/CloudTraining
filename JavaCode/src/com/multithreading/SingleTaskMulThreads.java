package com.multithreading;

public class SingleTaskMulThreads  extends Thread{

	public void run() {
		System.out.println("one task");
	}
	public static void main(String[] args) {
		SingleTaskMulThreads s = new SingleTaskMulThreads();
		SingleTaskMulThreads s1 = new SingleTaskMulThreads();
		SingleTaskMulThreads s2 = new SingleTaskMulThreads();

		
	
		s.start();
		s1.start();
		s2.start();
		
		
		System.out.println();
		//or
		
		Thread t = new Thread(new SingleTaskMulThreads()); // passing anonymus inner object in side the thread class
		Thread t1 = new Thread(new SingleTaskMulThreads());
		t.start();
		t1.start();
	}
}
