package com.abstractsConcepts;

import java.rmi.server.SocketSecurityException;

public class Main {
	public static void main(String[] args) {
		
		HondaVersion v = new HondaVersion();
		v.run();
		
		System.out.println();
		//  Bick class Objects
		
		Car c = new Car();
		c.run();
		c.changeGare();

		System.out.println();

		B b = new B();
		b.a();
		b.b();
		b.c();
		b.d();
	
	System.out.println();
	
	Banks bnk = new Banks();
	System.out.println(bnk.rateOfIntrest());
	
	ICICI i = new ICICI();
	System.out.println(i.rateOfIntrest());
	
	SBI ss = new SBI();
	System.out.println(ss.rateOfIntrest());
	
	
	
	System.out.println();
	// here is two impliment multiple interfaces
	
	MulInheritance mh = new MulInheritance();
	mh.print();
	mh.show();
	mh.dips();
	
	System.out.println();
	
	Test t = new Test();
	t.show();
	t.print();
	
	System.out.println();
	
	// injava8 consist the method body in side the method body 
	
	MethodBody me = new MethodBody();
	me.draw();
	me.message();
	
	System.out.println();
	
	StaticMethod st = new StaticMethod() ;
	st.count();
	System.out.println(Java8StaticMethod.sum(5));
	System.out.println(Java8StaticMethod.mul(10));
	
	
	}
}
