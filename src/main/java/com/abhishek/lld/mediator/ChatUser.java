package com.abhishek.lld.mediator;

// Step 4: Create Concrete Colleague Classes ::: ChatUser

public class ChatUser extends User {
    public ChatUser(ChatRoomMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println(this.getName() + " sends: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.getName() + " receives: " + message);
    }
}
