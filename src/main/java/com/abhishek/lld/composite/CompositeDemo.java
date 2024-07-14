package com.abhishek.lld.composite;

// Step 4: Use the Composite Pattern

public class CompositeDemo {

	public static void main(String[] args) {
		FileSystemComponent file1 = new File("file1.txt", 10);
		FileSystemComponent file2 = new File("file2.txt", 20);
		FileSystemComponent file3 = new File("file3.txt", 30);

		Directory dir1 = new Directory("dir1");
		Directory dir2 = new Directory("dir2");

		dir1.addComponent(file1);
		dir1.addComponent(file2);

		dir2.addComponent(file3);
		dir2.addComponent(dir1);

		dir2.showDetails();
		System.out.println("Total size: " + dir2.getSize() + "KB");
	}
}
