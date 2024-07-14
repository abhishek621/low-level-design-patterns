package com.abhishek.lld.command;

// Step 2: Create the Receiver Class ::: Receiver Class: TextEditor

public class TextEditor {

	private String clipboard;
	private StringBuilder text;
	private String previousText; // To store previous state for undo

	public TextEditor() {
		this.clipboard = "";
		this.text = new StringBuilder();
		this.previousText = "";
	}

	public void copy(String textToCopy) {
		clipboard = textToCopy;
		System.out.println("Copied to clipboard: " + clipboard);
	}

	public void paste() {
		text.append(clipboard);
		System.out.println("Pasted from clipboard: " + clipboard);
		saveState(); // Save current state before paste
	}

	public void cut(String textToCut) {
		clipboard = textToCut;
		text = new StringBuilder(text.toString().replace(textToCut, ""));
		System.out.println("Cut to clipboard: " + clipboard);
		saveState(); // Save current state before cut
	}

	public void undo() {
		// Restore previous state
		text = new StringBuilder(previousText);
		System.out.println("Undo operation: " + text.toString());
	}

	private void saveState() {
		// Save current text state
		previousText = text.toString();
	}

	public void showText() {
		System.out.println("Current text: " + text.toString());
	}
}
