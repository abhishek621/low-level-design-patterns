package com.abhishek.lld.flyweight;

// Step 4: Use the Flyweight Pattern

public class FlyweightDemo {
	
    public static void main(String[] args) {
    	
    	Tree oakTree1 = TreeFactory.getTree("Oak", "Green");
        Tree oakTree2 = TreeFactory.getTree("Oak", "Green");
        Tree pineTree = TreeFactory.getTree("Pine", "Dark Green");
        Tree birchTree = TreeFactory.getTree("Birch", "Yellow");

        oakTree1.display(10, 20);
        oakTree2.display(30, 40);
        pineTree.display(50, 60);
        birchTree.display(70, 80);
        
        System.out.println("Total tree types created: " + TreeFactory.getTotalTrees());
    }
}
