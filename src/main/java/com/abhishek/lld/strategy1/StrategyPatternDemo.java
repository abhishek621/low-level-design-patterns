package com.abhishek.lld.strategy1;

// Step 4: Use the Strategy Pattern

import java.util.Arrays;

public class StrategyPatternDemo {
	
    public static void main(String[] args) {
    
    	SortContext context = new SortContext();
        int[] array = {5, 2, 9, 1, 5, 6};

        // Sort using QuickSort
        context.setSortStrategy(new QuickSort());
        context.sortArray(array);
        System.out.println("QuickSort: " + Arrays.toString(array));

        // Reset array
        array = new int[]{5, 2, 9, 1, 5, 6};

        // Sort using MergeSort
        context.setSortStrategy(new MergeSort());
        context.sortArray(array);
        System.out.println("MergeSort: " + Arrays.toString(array));

        // Reset array
        array = new int[]{5, 2, 9, 1, 5, 6};

        // Sort using BubbleSort
        context.setSortStrategy(new BubbleSort());
        context.sortArray(array);
        System.out.println("BubbleSort: " + Arrays.toString(array));
    }
}
