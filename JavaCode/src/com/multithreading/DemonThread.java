package com.multithreading;

/*Demon thread is the life cycle thread this thread life depends on user thread 
 * if all user thread has die automatically  die*/
public class DemonThread  extends Thread{
	
	public void run() {

		if(Thread.currentThread().isDaemon()) {
			System.out.println("daemon thread work");
		}
		else {
			System.out.println("user thread work");
		}

	}
	public static void main(String[] args) {
		DemonThread d = new DemonThread();
		DemonThread d1 = new DemonThread();
		d.setDaemon(true);

		d.start();
		d1.start();
	}

}
