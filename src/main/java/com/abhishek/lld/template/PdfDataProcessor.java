package com.abhishek.lld.template;

// Step 2: Create Concrete Subclass ::: PdfDataProcessor

public class PdfDataProcessor extends DataProcessor {
	
    @Override
    protected void readData() {
        System.out.println("Reading data from PDF file");
        // Implement PDF data reading logic
    }

    @Override
    protected void processData() {
        System.out.println("Processing PDF data");
        // Implement PDF data processing logic
    }

    @Override
    protected void writeData() {
        System.out.println("Writing data to output");
        // Implement data writing logic
    }
}