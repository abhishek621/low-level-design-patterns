package com.abhishek.lld.factory;

//Concrete Creator: BikeFactory
public class BikeFactory extends VehicleFactory {
    
	@Override
    public Vehicle createVehicle() {
        return new Bike();
    }
}
