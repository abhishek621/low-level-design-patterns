package com.abhishek.lld.builder;

// Step 4: Define the Director ::: Director

public class HouseDirector {

	private HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void constructHouse() {
        houseBuilder.buildFoundation();
        houseBuilder.buildStructure();
        houseBuilder.buildRoof();
        houseBuilder.buildInterior();
    }

    public House getHouse() {
        return this.houseBuilder.getHouse();
    }
}
