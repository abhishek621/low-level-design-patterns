package com.abhishek.lld.state;

// Step 1: Define the State Interface ::: TrafficLightState Interface

public interface TrafficLightState {
    void change(TrafficLightContext context);
    String getState();
}
