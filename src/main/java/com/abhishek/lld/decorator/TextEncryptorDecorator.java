package com.abhishek.lld.decorator;

// Concrete Decorator: Text Encryptor

public class TextEncryptorDecorator extends TextEditorDecorator {
    public TextEncryptorDecorator(TextEditor textEditor) {
        super(textEditor);
    }

    @Override
    public String edit(String text) {
        text = super.edit(text);
        return encryptText(text);
    }

    private String encryptText(String text) {
        // Add text encryption logic here
        return text + " [Encrypted]";
    }
}

