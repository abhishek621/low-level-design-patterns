package com.abhishek.lld.bridge;

// Step 2: Create Concrete Implementors ::: Concrete Implementor: HTML Content

public class HtmlContent implements Content {
    @Override
    public String formatMessage(String message) {
        return "<html><body><p>" + message + "</p></body></html>";
    }
}