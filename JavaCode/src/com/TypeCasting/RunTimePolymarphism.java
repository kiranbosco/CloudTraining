package com.TypeCasting;

public class RunTimePolymarphism {
	
	public static void main(String[] args) {

		Bank b = new Bank();
		b = new ICICI();
		System.out.println("SBI" +b.getRateOfInterest());

		b =new SBI();
		System.out.println("ICICI" +b.getRateOfInterest());

		b = new AXIS();
		System.out.println("AXIS" +b.getRateOfInterest());

		
	}

}
