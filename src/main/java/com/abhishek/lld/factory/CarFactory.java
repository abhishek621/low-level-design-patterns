package com.abhishek.lld.factory;

// Concrete Creator: CarFactory
public class CarFactory extends VehicleFactory {

	@Override
    public Vehicle createVehicle() {
        return new Car();
    }
}

