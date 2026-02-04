package com.ibm.Casting;

public class PaymentGateway {
	public void processPay(Payment payment, double amount) {
		
//		upcasting id done when objects is passed  
		payment.pay(amount);
		
//		downcasting from payment to creditcard to use validateCC()
		if(payment instanceof CreditcarPayment) {
			CreditcarPayment cc = (CreditcarPayment)payment;
			cc.validateCC();
			
//			((CreditcarPayment) payment).validateCC();
		}
		
	}
}
