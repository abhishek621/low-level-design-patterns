package com.abhishek.lld.abstractfactory;

//Step 4: Create Concrete Factories
//Concrete Factory: Mac Factory
public class MacFactory implements GUIFactory {
	@Override
	public Button createButton() {
		return new MacButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new MacCheckbox();
	}
}
