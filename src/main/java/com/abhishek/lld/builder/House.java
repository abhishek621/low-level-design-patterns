package com.abhishek.lld.builder;

// Step 1: Define the Product ::: Product

public class House {
    private String foundation;
    private String structure;
    private String roof;
    private String interior;

    // Getters and setters
    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    @Override
    public String toString() {
        return "House with foundation: " + foundation + ", structure: " + structure +
                ", roof: " + roof + ", interior: " + interior;
    }
}