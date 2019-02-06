package com.multithreading;

public class SetNameGetNameGetId  extends Thread{

	public void run() {

		System.out.println("running thread");
	}
	public static void main(String[] args) {
		
		SetNameGetNameGetId  s = new SetNameGetNameGetId();
		SetNameGetNameGetId  s1 = new SetNameGetNameGetId();

		s.start();
		s1.start();
		s1.setName("kiran");
		s1.getName();
		s.setName("Rajesh");
		
		s.getName();
		
		System.out.println(s.getName());
		System.out.println(s1.getName());

	}
}
