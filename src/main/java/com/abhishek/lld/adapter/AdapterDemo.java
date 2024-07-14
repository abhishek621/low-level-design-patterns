package com.abhishek.lld.adapter;

// Step 5: Use the Adapter

public class AdapterDemo {
    public static void main(String[] args) {
        // RoundHole and RoundPegs
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        System.out.println("Round peg fits in round hole: " + hole.fits(roundPeg));

        // SquarePeg and Adapter
        SquarePeg smallSquarePeg = new SquarePeg(5);
        SquarePeg largeSquarePeg = new SquarePeg(10);

        SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largeSquarePeg);

        System.out.println("Small square peg fits in round hole: " + hole.fits(smallSquarePegAdapter));
        System.out.println("Large square peg fits in round hole: " + hole.fits(largeSquarePegAdapter));
    }
}
