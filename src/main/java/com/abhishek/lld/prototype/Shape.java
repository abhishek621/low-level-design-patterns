package com.abhishek.lld.prototype;

// Let's create an example to demonstrate the Prototype pattern 
// We'll use a scenario where we need to create different shapes 
// (e.g., Circle and Rectangle) that can be cloned

//Step 1: Define the Prototype Interface ::: Prototype Interface

public interface Shape extends Cloneable {
    Shape clone();
    void draw();
}
