package com.abhishek.lld.cor;

// Step 2: Create Concrete Handler Classes ::: Concrete Handler for Info Level

public class InfoLogger extends Logger {
   
	public InfoLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Info Logger: " + message);
    }
}

