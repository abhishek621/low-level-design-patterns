package com.abhishek.lld.builder;

// Step 3: Create Concrete Builders ::: Concrete Builder: ConcreteHouseBuilder

public class ConcreteHouseBuilder implements HouseBuilder {
	
    private House house;

    public ConcreteHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildFoundation() {
        house.setFoundation("Concrete, brick, and stone foundation");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Concrete structure with rebar reinforcement");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Concrete slab roof");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Drywall and paint interior");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
