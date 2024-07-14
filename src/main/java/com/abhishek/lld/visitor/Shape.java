package com.abhishek.lld.visitor;

// Step 2: Define Visitable Interface (Element Interface)

public interface Shape {
    void accept(Visitor visitor);
}
