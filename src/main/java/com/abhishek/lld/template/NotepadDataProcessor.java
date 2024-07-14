package com.abhishek.lld.template;

// Step 2 : Create Concrete Subclass ::: NotepadDataProcessor

public class NotepadDataProcessor extends DataProcessor {

	@Override
    protected void readData() {
        System.out.println("Reading data from Notepad file");
        // Implement Notepad data reading logic
    }

    @Override
    protected void processData() {
        System.out.println("Processing Notepad data");
        // Implement Notepad data processing logic
    }

    @Override
    protected void writeData() {
        System.out.println("Writing data to output");
        // Implement data writing logic
    }
}