package com.abhishek.lld.state;

// Step 2: Create Concrete State Classes ::: YellowLightState

public class YellowLightState implements TrafficLightState {
    @Override
    public void change(TrafficLightContext context) {
        System.out.println("Changing from Yellow to Red");
        context.setState(new RedLightState());
    }

    @Override
    public String getState() {
        return "Yellow Light";
    }
}
