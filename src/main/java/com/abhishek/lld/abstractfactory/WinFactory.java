package com.abhishek.lld.abstractfactory;

//Step 4: Create Concrete Factories
// Concrete Factory: Windows Factory
public class WinFactory implements GUIFactory {
	@Override
	public Button createButton() {
		return new WinButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new WinCheckbox();
	}
}
