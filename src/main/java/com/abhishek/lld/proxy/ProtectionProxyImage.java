package com.abhishek.lld.proxy;

// Protection Proxy Class
public class ProtectionProxyImage implements Image {

	private RealImage realImage;
    private String filename;
    private String userRole;

    public ProtectionProxyImage(String filename, String userRole) {
        this.filename = filename;
        this.userRole = userRole;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }

    @Override
    public void delete() {
        if ("ADMIN".equalsIgnoreCase(userRole)) {
            if (realImage == null) {
                realImage = new RealImage(filename);
            }
            realImage.delete();
        } else {
            System.out.println("Permission denied: Only admins can delete images.");
        }
    }
}