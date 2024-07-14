package com.abhishek.lld.proxy;

// Step 2: Create the RealSubject Class ::: RealSubject Class

public class RealImage implements Image {

	private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading " + filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + filename);
    }

    @Override
    public void delete() {
        System.out.println("Deleting " + filename);
    }
}
