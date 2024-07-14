package com.abhishek.lld.iterator;

// Step 3: Define the Aggregate Interface ::: Aggregate Interface

public interface Container<E> {
    Iterator<E> createIterator();
}
