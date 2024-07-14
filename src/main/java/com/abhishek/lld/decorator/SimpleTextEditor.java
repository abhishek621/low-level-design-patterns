package com.abhishek.lld.decorator;

// Step 2: Create the Concrete Component ::: Concrete Component

public class SimpleTextEditor implements TextEditor {
   
	@Override
    public String edit(String text) {
        return text;
    }
}
