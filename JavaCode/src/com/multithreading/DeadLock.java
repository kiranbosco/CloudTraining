package com.multithreading;

public class DeadLock {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		
		final String resource1="kiran kumar";
		final String resource2 ="vijay kumar";
		
		Thread t1 = new Thread();
			synchronized(resource1) {
				System.out.println("thread 1 : locked resource 1");
				
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					e.printStackTrace();
					System.out.println(e);
				}
			}
			synchronized(resource2) {
				
				System.out.println("thread 2 : locked resource 2");
			}
			
			Thread t2 = new Thread();
			synchronized(resource2) {
				System.out.println(" thread 2 : is locked resourse 1");
			}
			t1.start();
			t2.start();
		}

	}

