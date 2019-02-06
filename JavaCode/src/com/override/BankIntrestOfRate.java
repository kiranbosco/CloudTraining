package com.override;

public class BankIntrestOfRate {
	
	int getRateOfInterest()
	
	{
		return 0;
		} 
}
class Sbi extends BankIntrestOfRate{

	int getRateOfInterest() {
		return 8;
	}
}
class Icici extends BankIntrestOfRate{
	
	int getRateOfInterest() {
		return 9;
		
	}
}
class Axis extends BankIntrestOfRate{
	
	int getRateOfInterest() {
		return 7;
	}
}