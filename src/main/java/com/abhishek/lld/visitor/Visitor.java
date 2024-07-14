package com.abhishek.lld.visitor;

// Step 1 : Define the Visitor Interface
public interface Visitor {
    void visit(Circle circle);
    void visit(Rectangle rectangle);
    void visit(Triangle triangle);
}
