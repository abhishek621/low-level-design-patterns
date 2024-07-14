package com.abhishek.lld.strategy3;

// Step 4: Use the Strategy Pattern

public class StrategyPatternDemo {

	public static void main(String[] args) {
   
		NavigationContext context = new NavigationContext();

        // Find path using Dijkstra's algorithm
        context.setPathfindingStrategy(new DijkstraPathfinding());
        context.findPath("A", "B");

        // Find path using A* algorithm
        context.setPathfindingStrategy(new AStarPathfinding());
        context.findPath("A", "B");

        // Find path using BFS algorithm
        context.setPathfindingStrategy(new BFSPathfinding());
        context.findPath("A", "B");
    }
}
