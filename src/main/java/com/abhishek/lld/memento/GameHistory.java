package com.abhishek.lld.memento;

import java.util.Stack;

// Step 3: Define the CareTaker Class ::: GameHistory

public class GameHistory {
	
    private Stack<CharacterMemento> mementos = new Stack<>();

    public void saveMemento(CharacterMemento memento) {
        mementos.push(memento);
    }

    public CharacterMemento undo() {
        if (!mementos.isEmpty()) {
            return mementos.pop();
        }
        return null;
    }
}
