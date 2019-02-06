package com.exceptionHandiling;

import java.io.IOException;

public class CheckedExeForward {
	
	void m() throws IOException {
		
			throw new java.io.IOException("devices Exception");

	}
	
	void n() throws IOException {
		m();
	}
	void p() {
		try {
			n();
		} catch (IOException e) {
			
			e.printStackTrace();
	//		System.out.println("exception handeled");
		}
	}
	public static void main(String[] args) throws IOException {
		CheckedExeForward ch  = new CheckedExeForward();
		ch.m();
		ch.n();
		ch.p();
	}

}
