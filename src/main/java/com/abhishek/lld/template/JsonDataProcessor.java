package com.abhishek.lld.template;

// Step 2 : Create Concrete Subclass ::: JsonDataProcessor

public class JsonDataProcessor extends DataProcessor {
	
    @Override
    protected void readData() {
        System.out.println("Reading data from JSON file");
        // Implement JSON data reading logic
    }

    @Override
    protected void processData() {
        System.out.println("Processing JSON data");
        // Implement JSON data processing logic
    }

    @Override
    protected void writeData() {
        System.out.println("Writing data to output");
        // Implement data writing logic
    }
}
