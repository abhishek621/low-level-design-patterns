package com.abhishek.lld.adapter;

//Usage of Object Adapter
public class ObjectAdapterDemo {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);

        SquarePeg smallSquarePeg = new SquarePeg(5);
        SquarePeg largeSquarePeg = new SquarePeg(10);

        RoundPeg smallSquarePegAdapter = new SquarePegObjectAdapter(smallSquarePeg);
        RoundPeg largeSquarePegAdapter = new SquarePegObjectAdapter(largeSquarePeg);

        System.out.println("Small square peg fits in round hole: " + hole.fits(smallSquarePegAdapter));
        System.out.println("Large square peg fits in round hole: " + hole.fits(largeSquarePegAdapter));
    }
}
