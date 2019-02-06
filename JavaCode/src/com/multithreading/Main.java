package com.multithreading;


@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {

		MulTaskMulThreads m = new MulTaskMulThreads();
		Mul2 ml = new Mul2();
		m.start();
		ml.start();

		System.out.println();
		// Non synchronized concept

		Table ts = new Table();
		MyThread ms = new MyThread(ts);
		MyThread2 mm = new MyThread2(ts);
		ms.start();
		mm.start();

		System.out.println( "   SYNCHRONIZED CONCEPT     ");

		SynchronizedConcept sy = new SynchronizedConcept();
		Mythreads tr = new Mythreads(sy);
		Mythreads2 mrs = new Mythreads2(sy);
		tr.start();
		mrs.start();

		System.out.println("  SYNCHRONIZED BLOCK    ");

		SynchronizedBlock bl = new SynchronizedBlock();
		Block bls = new Block(bl);
		bls.start();


		System.out.println(" STATIC CLASS WITH SYNCHRONIZED  ");

		SynchronizedMethod s = new SynchronizedMethod();
		MyTest t = new MyTest();
		Test tt = new Test();
		t.start();
		tt.start();

		
		System.out.println(" INTER THREAD CUMMINICATION ");

		
		Customer c = new Customer();
		Thread tk = new Thread() {
			
			public void run() {
				c.withdraw(10000);
				c.deposit(15000);
			}
		
			
		};
		tk.start();
		}
	}



