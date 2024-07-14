package com.abhishek.lld.abstractfactory;

// Step 5: Use the Abstract Factory
public class AbstractFactoryDemo {
    private Button button;
    private Checkbox checkbox;

    public AbstractFactoryDemo(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }

    public static void main(String[] args) {
        GUIFactory factory;
        String os = "Windows"; // or "Mac"

        if (os.equals("Windows")) {
            factory = new WinFactory();
        } else {
            factory = new MacFactory();
        }

        AbstractFactoryDemo app = new AbstractFactoryDemo(factory);
        app.paint();
    }
}
