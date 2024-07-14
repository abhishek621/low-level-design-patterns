package com.abhishek.lld.visitor;

// Step 5: Usage Example

import java.util.List;
import java.util.Arrays;

public class VisitorPatternDemo {
	public static void main(String[] args) {
		
		List<Shape> shapes = Arrays.asList(
				new Circle(5), 
				new Rectangle(3, 4), 
				new Triangle(6, 7)
				);

		AreaCalculator areaCalculator = new AreaCalculator();

		for (Shape shape : shapes) {
			shape.accept(areaCalculator);
		}
	}
}
