package com.multithreading;

// Here is the following tight coupling concept also one class object is depends on another class object also
public class SynchronizedConcept {
	
	public synchronized void printable(int n) throws InterruptedException {
		for(int i=0; i<5;i++) {
			System.out.println(n*i);
		}
		
		Thread.sleep(3500);
	}

}
class Mythreads extends Thread{
	
	SynchronizedConcept s;
	public Mythreads(SynchronizedConcept s) {
		this.s=s;
	}
	public void run() {
		try {
			s.printable(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
class Mythreads2 extends Thread{
	
	SynchronizedConcept s;
	public Mythreads2(SynchronizedConcept s) {
		this.s=s;
		
	}
	public void run() {
		try {
			s.printable(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
