package com.multithreading;

public class MulTaskMulThreads extends Thread{
	
	public void run() {
		System.out.println("one task");
	}

}
class Mul2 extends Thread{
	
	public void run() {
		System.out.println("two task");
	}
	
}
