package com.abhishek.lld.bridge;

// Concrete Implementor: JSON Content
// Adding More Implementors ::: You can add more content types (like JSON content) 
// without modifying the existing code:

public class JsonContent implements Content {
	
	@Override
	public String formatMessage(String message) {
		return "{\"message\": \"" + message + "\"}";
	}
}
