package com.abhishek.lld.visitor;

// Step 3: Create Concrete Element Classes (Concrete Shapes) :::  Triangle

public class Triangle implements Shape {
   
	private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
