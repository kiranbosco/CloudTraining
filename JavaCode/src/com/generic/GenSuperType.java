package com.generic;

public class GenSuperType implements CustInterface {

	@Override
	public void billing() {

		System.out.println("Billing method()");

	}

	@Override
	public void productDelivery() {

		System.out.println("Delivery method()");

	}
	
	class SucImplSuperMethod extends GenSuperType{
		
		void superMethod() {
			
			System.out.println("super method()");

			
		}
		 
	}

}
