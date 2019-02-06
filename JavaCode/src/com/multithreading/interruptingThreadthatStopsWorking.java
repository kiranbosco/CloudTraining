package com.multithreading;

public class interruptingThreadthatStopsWorking extends Thread{

	public void run() {
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println(e);

			throw new RuntimeException("Thread interrupted "+ e);
		}
	}
	public static void main(String[] args) {

		interruptingThreadthatStopsWorking ts = new interruptingThreadthatStopsWorking();
		ts.start();
		try {
			ts.interrupt();
		}catch(Exception e){System.out.println("Exception handled "+e);
			}
	}
}
