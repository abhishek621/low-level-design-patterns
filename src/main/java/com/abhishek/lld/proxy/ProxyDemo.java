package com.abhishek.lld.proxy;

// Step 4: Use the Proxy Pattern

public class ProxyDemo {
	
    public static void main(String[] args) {
    
    	Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        // Image will be loaded from disk
        image1.display();
        System.out.println();

        // Image will not be loaded from disk
        image1.display();
        System.out.println();

        // Image will be loaded from disk
        image2.display();
        System.out.println();

        // Image will not be loaded from disk
        image2.display();
        
        Image image3 = new ProtectionProxyImage("photo1.jpg", "USER");
        Image image4 = new ProtectionProxyImage("photo2.jpg", "ADMIN");

        // Display images
        image3.display();
        image4.display();

        // Attempt to delete images
        image3.delete();
        image4.delete();
    }
}
