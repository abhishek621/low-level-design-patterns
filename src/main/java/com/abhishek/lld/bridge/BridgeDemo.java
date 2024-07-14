package com.abhishek.lld.bridge;

// Step 5: Use the Bridge Pattern

public class BridgeDemo {
    public static void main(String[] args) {
        Content textContent = new TextContent();
        Content htmlContent = new HtmlContent();

        Notification urgentTextNotification = new UrgentNotification(textContent);
        Notification regularHtmlNotification = new RegularNotification(htmlContent);

        urgentTextNotification.send("Server is down!");
        regularHtmlNotification.send("Weekly newsletter");
    }
}
