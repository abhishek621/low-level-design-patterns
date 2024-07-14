package com.abhishek.lld.prototype;

//Step 3: Use the Prototype

public class PrototypeDemo {
    public static void main(String[] args) {
        // Create original objects
        Shape originalCircle = new Circle(5);
        Shape originalRectangle = new Rectangle(10, 20);

        // Clone the original objects
        Shape clonedCircle = originalCircle.clone();
        Shape clonedRectangle = originalRectangle.clone();

        // Draw the original and cloned circle objects
        System.out.println("Original Circle:");
        originalCircle.draw();
        System.out.println("Cloned Circle:");
        clonedCircle.draw();

     // Draw the original and cloned rectangle objects
        System.out.println("Original Rectangle:");
        originalRectangle.draw();
        System.out.println("Cloned Rectangle:");
        clonedRectangle.draw();
    }
}
