package com.abhishek.lld.decorator;

// Step 4: Create Concrete Decorators ::: Concrete Decorator: Spell Checker

public class SpellCheckerDecorator extends TextEditorDecorator {
    public SpellCheckerDecorator(TextEditor textEditor) {
        super(textEditor);
    }

    @Override
    public String edit(String text) {
        text = super.edit(text);
        return addSpellCheck(text);
    }

    private String addSpellCheck(String text) {
        // Add spell checking logic here
        return text + " [SpellChecked]";
    }
}

