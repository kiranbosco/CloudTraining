package com.override;

public class Main {

	public static void main(String[] args) {

		Bick b = new Bick();
		b.run();

		System.out.println();

		// Bank rate exe

		BankIntrestOfRate  bc = new BankIntrestOfRate();
		System.out.println(bc.getRateOfInterest()+ " RBI Intrest Rate");


		Icici i = new Icici();
		System.out.println(i.getRateOfInterest() + " Icici ");

		Sbi s = new Sbi();
		System.out.println(s.getRateOfInterest() + " Sbi");

		Axis x = new Axis();
		System.out.println(x.getRateOfInterest()+ " Axis");


		System.out.println();

		//Dynamic dispatcher method in java

		DMD ds = new DMD1();
		ds.show();


		System.out.println();

		DMDMultiLevel m,n,k;
		m = new Sub();
		m.disp();
		
		n = new Sub1();
		n.disp();
		
		k = new Sub2();
		k.disp();
		
    
		System.out.println();
	
		 Bikes obj=new Honda3();  
		  System.out.println(obj.speedlimit);//90  
	
	
	}

}
