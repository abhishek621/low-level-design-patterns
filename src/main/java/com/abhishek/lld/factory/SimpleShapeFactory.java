package com.abhishek.lld.factory;

//Concrete Creator
public class SimpleShapeFactory extends ShapeFactory {
    @Override
    public Shape createShape(String type) {
        switch (type) {
            case "Circle":
                return new Circle();
            case "Rectangle":
                return new Rectangle();
            default:
                throw new IllegalArgumentException("Unknown shape type.");
        }
    }
}

