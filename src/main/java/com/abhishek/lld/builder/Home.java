package com.abhishek.lld.builder;

// Fluent Interface
// A Fluent Interface provides a more readable and fluid way to construct an object

public class Home {

	private String foundation;
    private String structure;
    private String roof;
    private String interior;
    
    private Home(Builder builder) {
        this.foundation = builder.foundation;
        this.structure = builder.structure;
        this.roof = builder.roof;
        this.interior = builder.interior;
    }
    
    static class Builder {
        private String foundation;
        private String structure;
        private String roof;
        private String interior;

        public Builder setFoundation(String foundation) {
            this.foundation = foundation;
            return this;
        }

        public Builder setStructure(String structure) {
            this.structure = structure;
            return this;
        }

        public Builder setRoof(String roof) {
            this.roof = roof;
            return this;
        }

        public Builder setInterior(String interior) {
            this.interior = interior;
            return this;
        }

        public Home build() {
            return new Home(this);
        }
    }

    @Override
    public String toString() {
        return "Home with foundation: " + foundation + ", structure: " + structure +
                ", roof: " + roof + ", interior: " + interior;
    }
}
