package com.abhishek.lld.strategy3;

// Step 2 : Concrete Strategy Class ::: AStarPathfinding

public class AStarPathfinding implements PathfindingStrategy {

	@Override
    public void findPath(String start, String end) {
        System.out.println("Finding path using A* algorithm from " + start + " to " + end);
        // Add A* pathfinding logic here
    }
}
