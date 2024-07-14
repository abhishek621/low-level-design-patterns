package com.abhishek.lld.singleton;

/**
 * The Singleton pattern is a design pattern used to ensure that a class has
 * only one instance and provides a global point of access to that instance.
 * This is useful when exactly one object is needed to coordinate actions across
 * the system The Singleton pattern is typically implemented by creating a class
 * with a method that creates a new instance of the class if one does not exist
 * If one does exist, it simply returns a reference to that object
 * 
 * Key Concepts of Singleton Pattern :
 * 
 * Private Constructor : The constructor is made private to prevent the
 * instantiation of the class from outside
 * 
 * Static Instance : A static member is used to hold the single instance of the
 * class
 * 
 * Public Static Method : A public static method is used to provide the global
 * point of access to the instance
 * 
 * Use Cases of Singleton Pattern :
 * 
 * Configuration Settings : Singleton is often used for configuration settings
 * where only one instance of configuration should exist
 * 
 * Logging : A logger utility class is typically implemented as a Singleton to
 * ensure that all parts of the application use the same logging instance
 * 
 * Caching : Singleton pattern can be used for caching purposes where a single
 * instance of cache can be accessed throughout the application
 * 
 * Thread Pooling : To manage a pool of threads, the Singleton pattern ensures
 * there is only one thread pool manager
 * 
 * Database Connections : A database connection pool can be managed using the
 * Singleton pattern to ensure that all parts of the application use the same
 * connection pool
 * 
 * @author Abhishek Kumar
 */

public class Singleton {

	// Private static instance of the same class
	private static Singleton instance;

	// Private constructor to restrict instantiation from other classes
	private Singleton() {
		// Initialization code here
	}

	// Public static method to provide a global point of access
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	public void showMessage() {
		System.out.println("Hello, I am a Singleton!");
	}

	public static void main(String[] args) {
		// Illegal construct Compile Time Error: The constructor Singleton() is not
		// visible

		// Singleton obj = new Singleton();

		// Get the only object available
		Singleton singleObject = Singleton.getInstance();

		// Show the message
		singleObject.showMessage();
	}
}
