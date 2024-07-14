package com.abhishek.lld.composite;

// Step 3: Create Composite Class ::: Composite

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent {

	private String name;
	
	private List<FileSystemComponent> components = new ArrayList<>();

	public Directory(String name) {
		this.name = name;
	}

	public void addComponent(FileSystemComponent component) {
		components.add(component);
	}

	public void removeComponent(FileSystemComponent component) {
		components.remove(component);
	}

	@Override
	public void showDetails() {
		System.out.println("Directory: " + name);
		for (FileSystemComponent component : components) {
			component.showDetails();
		}
	}

	@Override
	public int getSize() {
		int totalSize = 0;
		for (FileSystemComponent component : components) {
			totalSize += component.getSize();
		}
		return totalSize;
	}
}
