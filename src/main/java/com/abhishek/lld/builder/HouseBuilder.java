package com.abhishek.lld.builder;

// Step 2: Define the Builder Interface ::: Builder Interface

public interface HouseBuilder {
    void buildFoundation();
    void buildStructure();
    void buildRoof();
    void buildInterior();
    House getHouse();
}
