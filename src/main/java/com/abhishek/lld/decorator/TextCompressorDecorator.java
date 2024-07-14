package com.abhishek.lld.decorator;

// Step 4: Create Concrete Decorators ::: Concrete Decorator: Text Compressor

public class TextCompressorDecorator extends TextEditorDecorator {
    public TextCompressorDecorator(TextEditor textEditor) {
        super(textEditor);
    }

    @Override
    public String edit(String text) {
        text = super.edit(text);
        return compressText(text);
    }

    private String compressText(String text) {
        // Add text compression logic here
        return text + " [Compressed]";
    }
}
