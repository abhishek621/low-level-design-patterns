package com.abhishek.lld.memento;

// Step 1: Define the Memento Class ::: CharacterMemento Class

public class CharacterMemento {
    private int healthPoints;

    public CharacterMemento(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }
}
