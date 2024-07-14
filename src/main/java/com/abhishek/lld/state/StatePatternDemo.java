package com.abhishek.lld.state;

// Step 4: Use the State Pattern

public class StatePatternDemo {

	public static void main(String[] args) {
    
		TrafficLightContext trafficLight = new TrafficLightContext();

        // Initial state
        System.out.println("Initial State: " + trafficLight.getState());

        // Change state multiple times
        trafficLight.change();
        System.out.println("Current State: " + trafficLight.getState());

        trafficLight.change();
        System.out.println("Current State: " + trafficLight.getState());

        trafficLight.change();
        System.out.println("Current State: " + trafficLight.getState());
    }
}
