package com.abhishek.lld.factory;

public class FactoryMethodDemo {

	public static void main(String[] args) {
    
		VehicleFactory carFactory = new CarFactory();
        carFactory.testDrive();

        VehicleFactory bikeFactory = new BikeFactory();
        bikeFactory.testDrive();
    }
}
