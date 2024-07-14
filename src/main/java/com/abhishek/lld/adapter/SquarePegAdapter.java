package com.abhishek.lld.adapter;

// Step 3: Define the Adapter ::: Adapter
public class SquarePegAdapter extends RoundPeg {
	
    private SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius() {
        // Calculate a fitting radius for the square peg
        return Math.sqrt(Math.pow((squarePeg.getWidth() / 2), 2) * 2);
    }
}
