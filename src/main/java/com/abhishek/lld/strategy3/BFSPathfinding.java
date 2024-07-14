package com.abhishek.lld.strategy3;

// Step 2 : Concrete Strategy Class ::: BFSPathfinding

public class BFSPathfinding implements PathfindingStrategy {
    @Override
    public void findPath(String start, String end) {
        System.out.println("Finding path using BFS algorithm from " + start + " to " + end);
        // Add BFS pathfinding logic here
    }
}
