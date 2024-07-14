package com.abhishek.lld.state;

// Step 2: Create Concrete State Classes ::: RedLightState

public class RedLightState implements TrafficLightState {
    @Override
    public void change(TrafficLightContext context) {
        System.out.println("Changing from Red to Green");
        context.setState(new GreenLightState());
    }

    @Override
    public String getState() {
        return "Red Light";
    }
}

