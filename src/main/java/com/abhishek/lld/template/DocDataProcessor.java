package com.abhishek.lld.template;

// Step 2 : Create Concrete Subclass ::: DocDataProcessor

public class DocDataProcessor extends DataProcessor {

	@Override
    protected void readData() {
        System.out.println("Reading data from DOC file");
        // Implement DOC data reading logic
    }

    @Override
    protected void processData() {
        System.out.println("Processing DOC data");
        // Implement DOC data processing logic
    }

    @Override
    protected void writeData() {
        System.out.println("Writing data to output");
        // Implement data writing logic
    }
}