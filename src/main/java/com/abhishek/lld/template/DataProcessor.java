package com.abhishek.lld.template;

// Step 1: Define the Abstract Class ::: DataProcessor

public abstract class DataProcessor {
    // Template Method
    public final void process() {
        readData();
        processData();
        writeData();
    }

    protected abstract void readData();
    protected abstract void processData();
    protected abstract void writeData();
}
