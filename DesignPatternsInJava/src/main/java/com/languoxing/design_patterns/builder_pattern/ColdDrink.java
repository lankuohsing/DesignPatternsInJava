package com.languoxing.design_patterns.builder_pattern;

public abstract class ColdDrink implements Item {
    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();
}
