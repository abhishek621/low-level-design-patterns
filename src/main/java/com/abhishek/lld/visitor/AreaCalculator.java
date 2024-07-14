package com.abhishek.lld.visitor;

// Step 4: Implement Concrete Visitor (Operations) ::: AreaCalculator

public class AreaCalculator implements Visitor {

	@Override
    public void visit(Circle circle) {
        double area = Math.PI * circle.getRadius() * circle.getRadius();
        System.out.println("Area of Circle with radius " + circle.getRadius() + " is: " + area);
    }

    @Override
    public void visit(Rectangle rectangle) {
        double area = rectangle.getWidth() * rectangle.getHeight();
        System.out.println("Area of Rectangle with width " + rectangle.getWidth() + " and height " + rectangle.getHeight() + " is: " + area);
    }

    @Override
    public void visit(Triangle triangle) {
        double area = 0.5 * triangle.getBase() * triangle.getHeight();
        System.out.println("Area of Triangle with base " + triangle.getBase() + " and height " + triangle.getHeight() + " is: " + area);
    }
}
