package com.abhishek.lld.bridge;

// Step 3: Define the Abstraction ::: Abstraction

public abstract class Notification {
    
	protected Content content;

    protected Notification(Content content) {
        this.content = content;
    }

    public abstract void send(String message);
}
