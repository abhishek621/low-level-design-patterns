package com.abhishek.lld.observer;
import java.util.ArrayList;
import java.util.List;

// Step 3 : Create Concrete Subject Class ::: WeatherStation

public class WeatherStation implements Subject {
	
    private List<Observer> observers;
    private int temperature;
    private int humidity;
    private int pressure;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurements(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}
