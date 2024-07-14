package com.abhishek.lld.decorator;

//Step 5: Use the Decorator Pattern

public class DecoratorDemo {

	public static void main(String[] args) {

		TextEditor simpleEditor = new SimpleTextEditor();
		TextEditor spellCheckedEditor = new SpellCheckerDecorator(simpleEditor);
		TextEditor compressedEditor = new TextCompressorDecorator(spellCheckedEditor);
		TextEditor encryptedEditor = new TextEncryptorDecorator(compressedEditor);

		String text = "Hello, this is a sample text.";

		System.out.println("Simple Editor: " + simpleEditor.edit(text));
		System.out.println("Spell Checked Editor: " + spellCheckedEditor.edit(text));
		System.out.println("Compressed Editor: " + compressedEditor.edit(text));
		System.out.println("Encrypted Editor: " + encryptedEditor.edit(text));
	}
}
