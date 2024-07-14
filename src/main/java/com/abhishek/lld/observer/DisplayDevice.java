package com.abhishek.lld.observer;

// Step 4: Create Concrete Observer Class: DisplayDevice

public class DisplayDevice implements Observer {
	
	public DisplayDevice(Subject weatherStation) {
        weatherStation.registerObserver(this);
    }
	

    @Override
    public void update(int temperature, int humidity, int pressure) {
        System.out.println("Display Device - Temperature: " + temperature + "°C, Humidity: " + humidity + "%, Pressure: " + pressure + "hPa");
    }
}
