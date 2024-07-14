package com.abhishek.lld.strategy3;

// Step 3: Create the Context Class ::: NavigationContext

public class NavigationContext {

	private PathfindingStrategy pathfindingStrategy;

    public void setPathfindingStrategy(PathfindingStrategy pathfindingStrategy) {
        this.pathfindingStrategy = pathfindingStrategy;
    }

    public void findPath(String start, String end) {
        pathfindingStrategy.findPath(start, end);
    }
}
