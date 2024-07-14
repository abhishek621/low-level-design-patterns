package com.abhishek.lld.strategy;

// Step 2 : Create Concrete Strategy Classes ::: CreditCardPayment
public class CreditCardPayment implements PaymentStrategy {

	private String cardNumber;
	private String cardHolderName;
	private String cvv;

	public CreditCardPayment(String cardNumber, String cardHolderName, String cvv) {
		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
		this.cvv = cvv;
	}

	@Override
	public void pay(int amount) {
		System.out.println("Paid " + amount + " using Credit Card");
	}
}


// Concrete Strategy Class CreditCardPayment : Implement the PaymentStrategy 
// interface with specific payment methods
