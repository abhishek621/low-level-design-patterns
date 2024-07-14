package com.abhishek.lld.command;

// Step 3: Create Concrete Command Classes ::: Concrete Command Class: CopyCommand

public class CopyCommand implements Command {

	private TextEditor textEditor;
    private String textToCopy;

    public CopyCommand(TextEditor textEditor, String textToCopy) {
        this.textEditor = textEditor;
        this.textToCopy = textToCopy;
    }

    @Override
    public void execute() {
        textEditor.copy(textToCopy);
    }

    @Override
    public void undo() {
        // No undo action for copy
        System.out.println("Undo copy not supported.");
    }
}

