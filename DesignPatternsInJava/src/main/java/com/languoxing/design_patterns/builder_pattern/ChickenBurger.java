package com.languoxing.design_patterns.builder_pattern;

public class ChickenBurger extends Burger {
    @Override
    public float price() {
        return 50.0f;
    }

    public String name() {
        return "Chicken Burger";
    }
}
