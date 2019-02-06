package com.multithreading;

// Thread will not be star the twise if ur trying to star the thread it will be given illegalThreadStateExcuption

public class StartTwiseThread extends Thread{

	public void run() {
		System.out.println(" now start the thread twise it will be given illigalExcetionThread");
	}
	public static void main(String[] args) {
		StartTwiseThread t = new StartTwiseThread();
		t.start();
		t.start();
	}
}
