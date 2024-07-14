package com.abhishek.lld.command;

// Step 1: Define the Command Interface ::: Command Interface

public interface Command {
    void execute();
    void undo();
}
