package com.abhishek.lld.adapter;

// Enhanced Adapter Implementations
// Instead of inheriting from both the target and adaptee interfaces, the 
// adapter can contain an instance of the adaptee, allowing more flexibility
// Object Adapter

public class SquarePegObjectAdapter extends RoundPeg {

	private SquarePeg squarePeg;

    public SquarePegObjectAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius() {
        // Calculate a fitting radius for the square peg
        return Math.sqrt(Math.pow((squarePeg.getWidth() / 2), 2) * 2);
    }
}

