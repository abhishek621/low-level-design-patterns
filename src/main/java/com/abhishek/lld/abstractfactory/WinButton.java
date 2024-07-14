package com.abhishek.lld.abstractfactory;

// Step 2: Create Concrete Products
// Concrete Product: Windows Button
public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Painting a Windows button...");
    }
}

