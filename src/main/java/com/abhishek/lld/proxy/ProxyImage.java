package com.abhishek.lld.proxy;

// Step 3: Create the Proxy Class ::: Proxy Class

public class ProxyImage implements Image {
	
    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        logAccess();
        realImage.display();
    }
    
    private void logAccess() {
        System.out.println("Accessing image: " + filename);
    }

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
}
