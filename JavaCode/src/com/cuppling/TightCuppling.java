package com.cuppling;

/* Cuppling refer by one object refer to another object there are two type in cuppling 
loose cuppling and tight cuppling*/

// TightCuppling   Exe
public class TightCuppling {
	Topic t = new Topic();
	public void startReading() {
		t.understand();
		t.notUnderstand();
	}
}
class Topic{
	public void understand() {

		System.out.println("tight cuppling");
	}
	
	void notUnderstand() {
		System.out.println("i am not understand");
	}
	
}

// in the above program if any changes in the topic class u need to change the subject class also it will be depended in one class to another class 
