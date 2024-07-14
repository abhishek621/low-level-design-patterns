package com.abhishek.lld.state;

// Step 3: Create the Context Class ::: TrafficLightContext

public class TrafficLightContext {
	
    private TrafficLightState state;

    public TrafficLightContext() {
        // Initial state
        this.state = new RedLightState();
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public void change() {
        state.change(this);
    }

    public String getState() {
        return state.getState();
    }
}
