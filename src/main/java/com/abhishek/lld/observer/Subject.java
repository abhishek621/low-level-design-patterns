package com.abhishek.lld.observer;

// Step 2 : Define the Subject Interface ::: Subject Interface

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
