package com.abhishek.lld.state;

// Step 2: Create Concrete State Classes ::: GreenLightState

public class GreenLightState implements TrafficLightState {
    @Override
    public void change(TrafficLightContext context) {
        System.out.println("Changing from Green to Yellow");
        context.setState(new YellowLightState());
    }

    @Override
    public String getState() {
        return "Green Light";
    }
}


