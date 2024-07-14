package com.abhishek.lld.bridge;

// Step 2: Create Concrete Implementors ::: Concrete Implementor: Text Content

public class TextContent implements Content {

	@Override
	public String formatMessage(String message) {
		return "Text: " + message;
	}
}