package com.abhishek.lld.strategy3;

// Step 2 : Concrete Strategy Class ::: DijkstraPathfinding

public class DijkstraPathfinding implements PathfindingStrategy {

	@Override
    public void findPath(String start, String end) {
        System.out.println("Finding path using Dijkstra's algorithm from " + start + " to " + end);
        // Add Dijkstra's pathfinding logic here
    }
}
