package com.abhishek.lld.strategy1;

// Step 3 : Create the Context Class ::: SortContext

public class SortContext {
	
    private SortStrategy sortStrategy;

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void sortArray(int[] array) {
        sortStrategy.sort(array);
    }
}
