package com.abhishek.lld.memento;

//Step 4: Use the Memento Pattern

public class MementoGameDemo {

	public static void main(String[] args) {
        GameCharacter character = new GameCharacter(100);
        GameHistory history = new GameHistory();

        // Game scenario: character takes damage
        character.receiveDamage(20);
        character.receiveDamage(30);

        // Save the state
        history.saveMemento(character.saveToMemento());

        // Character takes more damage
        character.receiveDamage(50);

        // Undo to previous state
        CharacterMemento memento = history.undo();
        if (memento != null) {
            character.restoreFromMemento(memento);
            System.out.println("Character's health points after undo: " + character.getHealthPoints());
        } else {
            System.out.println("Nothing to undo.");
        }
    }
}
