package com.multithreading;

@SuppressWarnings("static-access")


public class SynchronizedMethod {

	public static void printTable(int n) throws InterruptedException {
		for(int i=1;i<5;i++) {
			System.out.println(i);
		}
		Thread.sleep(3500);	
	}

}
class Test extends Thread{


	public void run() {

		try {
			SynchronizedMethod.printTable(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class MyTest extends Thread{

	public void run() {
		try {
			SynchronizedMethod.printTable(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}