package com.abhishek.lld.builder;

// Step 5: Use the Builder

public class BuilderDemo {

	public static void main(String[] args) {
    
		// Build a concrete house
        HouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();
        HouseDirector concreteHouseDirector = new HouseDirector(concreteHouseBuilder);
        concreteHouseDirector.constructHouse();
        House concreteHouse = concreteHouseDirector.getHouse();
        System.out.println(concreteHouse);

        // Build a wooden house
        HouseBuilder woodenHouseBuilder = new WoodenHouseBuilder();
        HouseDirector woodenHouseDirector = new HouseDirector(woodenHouseBuilder);
        woodenHouseDirector.constructHouse();
        House woodenHouse = woodenHouseDirector.getHouse();
        System.out.println(woodenHouse);
    }
}
