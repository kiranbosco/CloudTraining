package com.InnerClass;


/* A class create the inside the method , method inside the one more create the class is called as the local inner clss
 * Local inner class method cant be invoke the outside the method */

@SuppressWarnings("unused")
public class LocalInnerClass  extends Thread{
	
	private int data =30;


	public void disp() throws InterruptedException {
		
		class InsideLocaInnerClass{
			
			void mes() throws InterruptedException {
				synchronized (this) {
					
					Thread.sleep(2500);
					for(int i=0; i<10;i++) {
						System.out.println(data);
						}
					for(int j=1;j<5 ;j++) {
					System.out.println(" i am adding just for checking skils");
				}
				}
				disp();
			}
			
			public void disp() {
				System.out.println("out side the method()");
			}
		}
		InsideLocaInnerClass in = new InsideLocaInnerClass();
		in.mes();
	}
	public static void main(String[] args) throws InterruptedException {
		
		LocalInnerClass l = new LocalInnerClass();
		l.disp();
	}

}
