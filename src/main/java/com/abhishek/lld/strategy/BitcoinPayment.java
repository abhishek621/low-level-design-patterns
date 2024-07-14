package com.abhishek.lld.strategy;

// Step 2 : Create Concrete Strategy Classes ::: BitcoinPayment

public class BitcoinPayment implements PaymentStrategy {
	
    private String bitcoinAddress;

    public BitcoinPayment(String bitcoinAddress) {
        this.bitcoinAddress = bitcoinAddress;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Bitcoin");
    }
}

// Concrete Strategy Class BitcoinPayment : Implement the PaymentStrategy interface 
// with specific payment methods
