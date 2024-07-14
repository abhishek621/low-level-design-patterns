package com.abhishek.lld.template;

// Step 2: Create Concrete Subclass ::: CSVDataProcessor

public class CSVDataProcessor extends DataProcessor {

	@Override
    protected void readData() {
        System.out.println("Reading data from CSV file");
        // Implement CSV data reading logic
    }

    @Override
    protected void processData() {
        System.out.println("Processing CSV data");
        // Implement CSV data processing logic
    }

    @Override
    protected void writeData() {
        System.out.println("Writing data to output");
        // Implement data writing logic
    }
}
