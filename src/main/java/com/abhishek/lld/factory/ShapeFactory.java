package com.abhishek.lld.factory;

//Creator Class
public abstract class ShapeFactory {
	public abstract Shape createShape(String type);

	public void drawShape(String type) {
		Shape shape = createShape(type);
		shape.draw();
	}
}
