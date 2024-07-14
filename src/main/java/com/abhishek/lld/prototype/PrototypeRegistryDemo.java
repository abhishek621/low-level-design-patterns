package com.abhishek.lld.prototype;

//Usage of Prototype Registry

public class PrototypeRegistryDemo {

	public static void main(String[] args) {
        // Create original objects
        Shape originalCircle = new Circle(5);
        Shape originalRectangle = new Rectangle(10, 20);

        // Register prototypes
        PrototypeRegistry registry = new PrototypeRegistry();
        registry.addPrototype("Circle", originalCircle);
        registry.addPrototype("Rectangle", originalRectangle);

        // Clone objects from the registry
        Shape clonedCircle = registry.getPrototype("Circle");
        Shape clonedRectangle = registry.getPrototype("Rectangle");

        // Draw the cloned objects
        System.out.println("Cloned Circle from Registry:");
        clonedCircle.draw();
        System.out.println("Cloned Rectangle from Registry:");
        clonedRectangle.draw();
    }
}
