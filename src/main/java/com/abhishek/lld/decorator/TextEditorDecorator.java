package com.abhishek.lld.decorator;

// Step 3: Create the Decorator Class ::: Decorator

public abstract class TextEditorDecorator implements TextEditor {

	protected TextEditor textEditor;

    protected TextEditorDecorator(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public String edit(String text) {
        return textEditor.edit(text);
    }
}
