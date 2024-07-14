package com.abhishek.lld.observer;

// Step 1 : Define the Observer Interface ::: Observer Interface

public interface Observer {
    void update(int temperature, int humidity, int pressure);
}
