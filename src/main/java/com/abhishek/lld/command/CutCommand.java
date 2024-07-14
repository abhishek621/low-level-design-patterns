package com.abhishek.lld.command;

//Step 3: Create Concrete Command Classes ::: Concrete Command Class: CutCommand

public class CutCommand implements Command {
	
	private TextEditor textEditor;
    private String textToCut;

    public CutCommand(TextEditor textEditor, String textToCut) {
        this.textEditor = textEditor;
        this.textToCut = textToCut;
    }

    @Override
    public void execute() {
        textEditor.cut(textToCut);
    }

    @Override
    public void undo() {
        textEditor.undo();
    }
}
