package com.abhishek.lld.mediator;

// Step 5: Use the Mediator Pattern

public class MediatorPatternDemo {

	public static void main(String[] args) {
    
		ChatRoomMediator chatRoom = new ChatRoom();

        User user1 = new ChatUser(chatRoom, "User1");
        User user2 = new ChatUser(chatRoom, "User2");
        User user3 = new ChatUser(chatRoom, "User3");

        chatRoom.sendMessage("Hello everyone!", user1);
        user2.send("Hi, User1!");
        user3.send("Hello, folks!");

        user1.receive("Hi, User1!");
    }
}
