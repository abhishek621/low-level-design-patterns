package com.abhishek.lld.command;

//Step 3: Create Concrete Command Classes ::: Concrete Command Class: PasteCommand

public class PasteCommand implements Command {

	private TextEditor textEditor;

	public PasteCommand(TextEditor textEditor) {
		this.textEditor = textEditor;
	}

	@Override
	public void execute() {
		textEditor.paste();
	}

	@Override
	public void undo() {
		textEditor.undo();
	}
}
