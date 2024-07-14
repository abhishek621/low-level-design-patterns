package com.abhishek.lld.iterator;

// Step 2: Create Concrete Iterator Class ::: IntegerArrayIterator

public class IntegerArrayIterator implements Iterator<Integer> {
	
    private int[] array;
    private int position;

    public IntegerArrayIterator(int[] array) {
        this.array = array;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < array.length;
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return array[position++];
        }
        return null;
    }
}
