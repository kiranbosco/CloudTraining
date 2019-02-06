package com.multithreading;


public class SynchronizedBlock {

	void printable(int n) {

		synchronized (this) {

			for(int i=1;i<5; i++) {
				System.out.println(n*i);
			}
			try {
				Thread.sleep(4000);
			}
			catch (Exception e) {
				System.out.println(e);
			}

		}
	}
}
class Block extends Thread{
	
	SynchronizedBlock s;
	public Block(SynchronizedBlock s) {
		
		this.s= s;
		}
public void run() {
	s.printable(100);
}
}


