package com.abhishek.lld.memento;

// Step 2: Define the Originator Class ::: GameCharacter

public class GameCharacter {
    private int healthPoints;

    public GameCharacter(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void receiveDamage(int damage) {
        healthPoints -= damage;
        System.out.println("Received " + damage + " damage. Current health: " + healthPoints);
    }

    public void restoreFromMemento(CharacterMemento memento) {
        this.healthPoints = memento.getHealthPoints();
        System.out.println("Restored health points to: " + healthPoints);
    }

    public CharacterMemento saveToMemento() {
        return new CharacterMemento(healthPoints);
    }

    public int getHealthPoints() {
        return healthPoints;
    }
}
