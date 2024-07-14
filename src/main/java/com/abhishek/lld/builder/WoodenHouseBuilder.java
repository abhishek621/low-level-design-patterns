package com.abhishek.lld.builder;

//Step 3: Create Concrete Builders ::: Concrete Builder: WoodenHouseBuilder

public class WoodenHouseBuilder implements HouseBuilder {

	private House house;

    public WoodenHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildFoundation() {
        house.setFoundation("Wooden foundation with treated lumber");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Wooden structure with timber framing");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Wooden shingles roof");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Wood paneling interior");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
