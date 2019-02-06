package com.multithreading;

// this  join method is used to thread die until it will be excuting
public class JoinMethod  extends Thread{

	public void run() {
		try {
			for(int i=1;i<5; i++) {
				System.out.println(i);
			}
		}
		catch (Exception e) {
			System.out.println();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		JoinMethod j = new JoinMethod();
		JoinMethod j1 = new JoinMethod();
		JoinMethod j2 = new JoinMethod();
		
		j.start();
		j.join();
		
		j1.start();
		j2.start();
		
	}
}


//NOTE :- this join method is used to waiting for until the thread die then it will be given to chance to new thread
