package com.abhishek.lld.strategy;

// Step 3: Create the Context Class ::: PaymentContext

public class PaymentContext {
	
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(int amount) {
        paymentStrategy.pay(amount);
    }
   
}


// PaymentContext Class: Maintains a reference to a PaymentStrategy object 
// and delegates the payment process to the current strategy. The setPaymentStrategy 
// method allows changing the strategy at runtime.