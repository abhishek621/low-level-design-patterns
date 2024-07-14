package com.abhishek.lld.factory;

//Concrete Products
public class Rectangle implements Shape {
	@Override
	public void draw() {
		System.out.println("Drawing a Rectangle...");
	}
}

