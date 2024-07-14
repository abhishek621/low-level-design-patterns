package com.abhishek.lld.mediator;

// Step 3: Define the Colleague Interface ::: Colleague Interface

public abstract class User {

	protected ChatRoomMediator mediator;
    protected String name;

    protected User(ChatRoomMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String message);
    public abstract void receive(String message);

    public String getName() {
        return name;
    }
}
