package com.abhishek.lld.template;

//Step 2 : Create Concrete Subclass ::: XMLDataProcessor

public class XMLDataProcessor extends DataProcessor {
	
    @Override
    protected void readData() {
        System.out.println("Reading data from XML file");
        // Implement XML data reading logic
    }

    @Override
    protected void processData() {
        System.out.println("Processing XML data");
        // Implement XML data processing logic
    }

    @Override
    protected void writeData() {
        System.out.println("Writing data to output");
        // Implement data writing logic
    }
}
