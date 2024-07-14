package com.abhishek.lld.factory;

//Concrete Product: Bike
public class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Riding a bike...");
    }
}
