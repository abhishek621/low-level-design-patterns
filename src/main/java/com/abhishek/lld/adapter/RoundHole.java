package com.abhishek.lld.adapter;

// Let's create an example to demonstrate the Adapter pattern, We'll use 
// a scenario where we have a RoundPeg and a SquarePeg that we want to 
// fit into a RoundHole

//Step 1: Define the Target Interface ::: Target Interface
public class RoundHole {
	
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {
        return this.getRadius() >= peg.getRadius();
    }
}
