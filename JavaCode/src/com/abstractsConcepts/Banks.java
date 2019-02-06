package com.abstractsConcepts;

public class Banks implements BankIntrest{

	@Override
	public float rateOfIntrest() {

		return 9.5f;
	}
}
	
class SBI implements BankIntrest{

	@Override
	public float rateOfIntrest() {
		return 7.5f;
	}
	
}

class ICICI implements BankIntrest{

	@Override
	public float rateOfIntrest() {
		return 8.9f;
	}
	
}

