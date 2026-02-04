package com.ibm.Casting;

public class Application
{
	public static void main( String[] args )
	{
		PaymentGateway paymentGateway = new PaymentGateway();
		
		Payment payment1 = new CreditcarPayment();
		Payment payment2 = new UpiPayment();
		
		paymentGateway.processPay(payment1, 1500);
		paymentGateway.processPay(payment2, 1200);
		
	}
}