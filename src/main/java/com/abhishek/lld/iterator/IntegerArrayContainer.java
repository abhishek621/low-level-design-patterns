package com.abhishek.lld.iterator;

// Step 4: Create Concrete Aggregate Class ::: IntegerArrayContainer

public class IntegerArrayContainer implements Container<Integer> {
	
    private int[] array;

    public IntegerArrayContainer(int[] array) {
        this.array = array;
    }

    @Override
    public Iterator<Integer> createIterator() {
        return new IntegerArrayIterator(array);
    }
}
