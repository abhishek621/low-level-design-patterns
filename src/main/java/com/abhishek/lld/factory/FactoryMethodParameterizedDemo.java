package com.abhishek.lld.factory;

//Using the Factory
public class FactoryMethodParameterizedDemo {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new SimpleShapeFactory();
		shapeFactory.drawShape("Circle");
		shapeFactory.drawShape("Rectangle");
	}
}
