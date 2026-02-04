package com.ibm.Casting;

public class CreditcarPayment extends Payment {

	@Override
	void pay(double amount) {
		System.out.println("amount paid using credit card is: " + amount);

	}
	
	public void validateCC() {
		System.out.println("The credit card is validated!");
	}

}
