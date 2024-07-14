package com.abhishek.lld.abstractfactory;

//Step 2: Create Concrete Products
//Concrete Product: Windows Checkbox
public class WinCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Painting a Windows checkbox...");
    }
}


