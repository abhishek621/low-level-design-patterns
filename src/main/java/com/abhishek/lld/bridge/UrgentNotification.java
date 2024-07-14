package com.abhishek.lld.bridge;

// Step 4: Create Refined Abstractions ::: Refined Abstraction: Urgent Notification

public class UrgentNotification extends Notification {

	public UrgentNotification(Content content) {
		super(content);
	}

	@Override
	public void send(String message) {
		System.out.println("Urgent Notification: " + content.formatMessage(message));
	}
}
