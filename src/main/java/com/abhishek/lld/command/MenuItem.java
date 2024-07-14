package com.abhishek.lld.command;

// Step 4: Create the Invoker Class ::: Invoker Class: MenuItem

public class MenuItem {

	private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void click() {
        command.execute();
    }
}
