package com.abhishek.lld.cor;

//Step 2: Create Concrete Handler Classes ::: Concrete Handler for Error Level

public class ErrorLogger extends Logger {

	public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Logger: " + message);
    }
}
