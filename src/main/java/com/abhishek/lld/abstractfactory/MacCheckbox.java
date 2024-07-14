package com.abhishek.lld.abstractfactory;

// Step 2: Create Concrete Products
//Concrete Product: Mac Checkbox
public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Painting a Mac checkbox...");
    }
}
