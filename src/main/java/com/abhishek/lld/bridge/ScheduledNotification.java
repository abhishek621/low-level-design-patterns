package com.abhishek.lld.bridge;

// Refined Abstraction: Scheduled Notification
// Adding More Notifications ::: You can also extend the notifications 
// without modifying the existing content code:

public class ScheduledNotification extends Notification {

	public ScheduledNotification(Content content) {
        super(content);
    }

    @Override
    public void send(String message) {
        System.out.println("Scheduled Notification: " + content.formatMessage(message));
    }
}
