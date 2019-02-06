package com.multithreading;


// this is the tread as normal Object if ur calling the directly run method instead of start method(); 
public class ProblemOfRunMInsteadOfStart extends Thread{

	public void run() {
		try {
			for(int i=1;i<5;i++) {
				System.out.println(i);		}

		}catch (Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		ProblemOfRunMInsteadOfStart ps = new ProblemOfRunMInsteadOfStart();
		ps.run();
		ps.run();
		
	}
}
