package com.abhishek.lld.abstractfactory;

// Step 2: Create Concrete Products
//Concrete Product: Mac Button
public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Painting a Mac button...");
    }
}

