package com.abhishek.lld.observer;

// Step 5: Use the Observer Pattern

public class ObserverPatternDemo {
   
	public static void main(String[] args) {
    
		WeatherStation weatherStation = new WeatherStation();

     // Create two display devices and register them as observers
        DisplayDevice displayDevice1 = new DisplayDevice(weatherStation);
        DisplayDevice displayDevice2 = new DisplayDevice(weatherStation);

        // Simulate weather changes
        System.out.println("First measurement set:");
        weatherStation.setMeasurements(25, 60, 1013);

        System.out.println("Second measurement set:");
        weatherStation.setMeasurements(27, 55, 1012);
    }
}
