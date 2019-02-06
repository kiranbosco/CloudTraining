package com.multithreading;


class Table{  
	void printTable(int n){//method not synchronized  
		for(int i=1;i<=5;i++){  
			System.out.println(n*i);  
			try{  
				Thread.sleep(400);  
			}catch(Exception e){System.out.println(e);}  
		}  

	}  
}  

class MyThread extends Thread{
	
	Table t;
	public MyThread(Table t) {
		
		this.t=t;
		
	}
	public void run() {
		t.printTable(5);
		
	}
}
class MyThread2 extends Thread{
	
	Table t;
	public MyThread2(Table t) {
		this.t=t;
		
	}
	public void run() {
		t.printTable(100);
	}
}