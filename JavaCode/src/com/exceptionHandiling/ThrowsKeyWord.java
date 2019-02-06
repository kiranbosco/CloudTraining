package com.exceptionHandiling;

import java.io.IOException;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ThrowsKeyWord {

	void m()throws IOException{

		throw new IOException("devices exception");
		
	}
	void n()throws IOException {
		
		m();
		
	}
	void p() throws IOException {
		 n();
	}

	public static void main(String[] args) throws IOException {
		ThrowsKeyWord t = new ThrowsKeyWord();
		t.p();
	/*	t.m();
		t.n();*/
		
		System.out.println("normal flow");
	}
}
