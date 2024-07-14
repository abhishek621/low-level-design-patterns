package com.abhishek.lld.strategy;

// Step 1: Define the Strategy Interface ::: PaymentStrategy Interface

public interface PaymentStrategy {
    void pay(int amount);
}


/// PaymentStrategy Interface: Defines the pay method that all concrete strategies must implement