package com.abhishek.lld.factory;

//Concrete Products
public class Circle implements Shape {
	@Override
	public void draw() {
		System.out.println("Drawing a Circle...");
	}
}
