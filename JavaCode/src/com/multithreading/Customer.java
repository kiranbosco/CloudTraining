package com.multithreading;

// Intercommunication thread
public class Customer {

	int amount =10000;

	synchronized void withdraw(int amount) {
		System.out.println("going  to draw");

		if(this.amount<amount) {
			System.out.println("balance is less waiting for deposit");

		}
		try {
			wait(); // this method is used suspend the some period of time ur object
		}
		catch (Exception e) {
			System.out.println(e);		
		}
		this.amount-=amount;
		System.out.println("with draw complited");

	}

	synchronized void deposit(int amount) {
		System.out.println("deoo");

		this.amount+=amount;
		System.out.println("deposit has been complited");
		notify(); // this method is given to information to object thread bas been released
	}
	


}
