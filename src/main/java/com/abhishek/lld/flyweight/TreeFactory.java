package com.abhishek.lld.flyweight;

// Step 3: Create Flyweight Factory ::: Flyweight Factory

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    
	private static final Map<String, Tree> treeMap = new HashMap<>();

    public static Tree getTree(String name, String color) {
        String key = name + "-" + color;
        Tree tree = treeMap.get(key);
        if (tree == null) {
            tree = new TreeType(name, color);
            treeMap.put(key, tree);
        }
        return tree;
    }
    
    public static int getTotalTrees() {
        return treeMap.size();
    }
}
