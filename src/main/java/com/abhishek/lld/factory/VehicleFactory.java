package com.abhishek.lld.factory;

// Creator Class
public abstract class VehicleFactory {

	// Factory Method
    public abstract Vehicle createVehicle();
    
    // Some operations on Vehicle objects
    public void testDrive() {
        Vehicle vehicle = createVehicle();
        vehicle.drive();
    }
}
