package com.generic;

public class Customer implements CustInterface{

	@Override
	public void billing() {

		System.out.println("here is the billing process()");
	}

	@Override
	public void productDelivery() {
		
		System.out.println("here is the productDelivery process()");
	}

}
class Customer2 extends Customer{
	
	void productImpl() {
		
		System.out.println("here is the product implimentation()");
		
	}
	
}
