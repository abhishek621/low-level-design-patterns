package com.abhishek.lld.mediator;

// Step 2: Create Concrete Mediator Class ::: ChatRoom

public class ChatRoom implements ChatRoomMediator {
    @Override
    public void sendMessage(String message, User user) {
        System.out.println(user.getName() + " sends message: " + message);
    }
}
