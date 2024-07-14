package com.abhishek.lld.template;

// Step 3: Use the Template Method Pattern

public class TemplateMethodPatternDemo {
	
    public static void main(String[] args) {
        // Process CSV data
        DataProcessor csvProcessor = new CSVDataProcessor();
        csvProcessor.process();
        System.out.println();

        // Process XML data
        DataProcessor xmlProcessor = new XMLDataProcessor();
        xmlProcessor.process();
        System.out.println();

        // Process PDF data
        DataProcessor pdfProcessor = new PdfDataProcessor();
        pdfProcessor.process();
        System.out.println();

        // Process DOC data
        DataProcessor docProcessor = new DocDataProcessor();
        docProcessor.process();
        System.out.println();

        // Process JSON data
        DataProcessor jsonDataProcessor = new JsonDataProcessor();
        jsonDataProcessor.process();
        System.out.println();

        // Process Notepad data
        DataProcessor notepadDataProcessor = new NotepadDataProcessor();
        notepadDataProcessor.process();
    }
}

