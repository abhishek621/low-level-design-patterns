package com.abhishek.lld.command;

// Step 5: Use the Command Pattern

public class CommandPatternDemo {

		public static void main(String[] args) {

			TextEditor textEditor = new TextEditor();

			Command copyCommand = new CopyCommand(textEditor, "Hello, World!");
	        Command pasteCommand = new PasteCommand(textEditor);
	        Command cutCommand = new CutCommand(textEditor, "World!");
	        
	        MenuItem copyMenuItem = new MenuItem();
	        MenuItem pasteMenuItem = new MenuItem();
	        MenuItem cutMenuItem = new MenuItem();

	        // Copy text
	        copyMenuItem.setCommand(copyCommand);
	        copyMenuItem.click();
	        textEditor.showText();

	        // Paste text
	        pasteMenuItem.setCommand(pasteCommand);
	        pasteMenuItem.click();
	        textEditor.showText();

	        // Undo paste
	        pasteMenuItem.click();
	        textEditor.showText();

	        // Cut text
	        cutMenuItem.setCommand(cutCommand);
	        cutMenuItem.click();
	        textEditor.showText();

	        // Undo cut
	        cutMenuItem.click();
	        textEditor.showText();
    }
}
