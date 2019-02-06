package com.multithreading;

public class JoinLongMilliSecounds  extends Thread{

	public void run() {
		try {
			for(int i=1; i<5; i++) {
				Thread.sleep(500);
				System.out.println(i);
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		JoinLongMilliSecounds j = new JoinLongMilliSecounds();
		JoinLongMilliSecounds j1 = new JoinLongMilliSecounds();
		JoinLongMilliSecounds j2 = new JoinLongMilliSecounds();
		
		j.start();
		j.join(3000);
		
		j1.start();
		j2.start();
	}
}
