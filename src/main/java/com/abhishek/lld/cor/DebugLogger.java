package com.abhishek.lld.cor;

// Step 2: Create Concrete Handler Classes ::: Concrete Handler for Debug Level

public class DebugLogger extends Logger {
	
    public DebugLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Debug Logger: " + message);
    }
}


