package com.abhishek.lld.cor;

//  Step 2: Create Concrete Handler Classes ::: Concrete Handler for Warning Level

public class WarningLogger extends Logger {

	public WarningLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Warning Logger: " + message);
    }
}
