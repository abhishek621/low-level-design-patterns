package com.abhishek.lld.strategy;

// Step 4: Use the Strategy Pattern

public class StrategyPatternDemo {
	
    public static void main(String[] args) {
    
    	PaymentContext paymentContext = new PaymentContext();

        // Pay using Credit Card
        paymentContext.setPaymentStrategy(new CreditCardPayment("1234567890123456", "John Doe", "123"));
        paymentContext.pay(100);

        // Pay using PayPal
        paymentContext.setPaymentStrategy(new PayPalPayment("john.doe@example.com", "password"));
        paymentContext.pay(200);

        // Pay using Bitcoin
        paymentContext.setPaymentStrategy(new BitcoinPayment("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa"));
        paymentContext.pay(300);
    }
}


// StrategyPatternDemo Class: Demonstrates how to use the Strategy pattern 
// by setting different payment strategies and executing the payment