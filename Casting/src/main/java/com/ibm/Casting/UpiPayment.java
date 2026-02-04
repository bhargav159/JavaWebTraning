package com.ibm.Casting;

public class UpiPayment extends Payment {

	@Override
	void pay(double amount) {
		System.out.println("amount paid using UPI is:"+amount);

	}

}
