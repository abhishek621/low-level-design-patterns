package com.abhishek.lld.strategy;

// Step 2: Create Concrete Strategy Classes ::: PayPalPayment

public class PayPalPayment implements PaymentStrategy {
	
    private String email;
    private String password;

    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal ");
    }
}

// Concrete Strategy Classe PayPalPayment : Implement the PaymentStrategy 
// interface with specific payment methods


