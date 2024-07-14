package com.abhishek.lld.bridge;

// Step 4: Create Refined Abstractions ::: Refined Abstraction: Regular Notification

public class RegularNotification extends Notification {

	public RegularNotification(Content content) {
        super(content);
    }

    @Override
    public void send(String message) {
        System.out.println("Regular Notification: " + content.formatMessage(message));
    }
}
