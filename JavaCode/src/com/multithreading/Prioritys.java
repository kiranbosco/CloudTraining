package com.multithreading;

// Priority are represents integer value there are 3 type so priority's max min normal [max 10 , normal 5 , min 1]
public class Prioritys extends Thread{
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		
		Prioritys p = new Prioritys();
		Prioritys p1 = new Prioritys();
		p.setPriority(MIN_PRIORITY);
		p1.setPriority(MAX_PRIORITY);
		p.start();
		p1.start();
	}
}
