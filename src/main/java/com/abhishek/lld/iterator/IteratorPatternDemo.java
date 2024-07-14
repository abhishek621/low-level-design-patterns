package com.abhishek.lld.iterator;

// Step 5: Use the Iterator Pattern

public class IteratorPatternDemo {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5 };
		Container<Integer> container = new IntegerArrayContainer(numbers);
		Iterator<Integer> iterator = container.createIterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
