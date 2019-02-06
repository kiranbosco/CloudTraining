package com.multithreading;

public class Multi  extends Thread{
	
	// Here is the thread is running 
		public void run() {
			System.out.println("thi  is the runnable method it is consist the one method that is the run method()");
			
		}
		public static void main(String[] args) {
			
			Multi  mul = new Multi();
			mul.start();
		}
	}
