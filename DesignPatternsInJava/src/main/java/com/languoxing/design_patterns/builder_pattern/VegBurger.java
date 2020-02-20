package com.languoxing.design_patterns.builder_pattern;

public class VegBurger extends Burger {
    @Override
    public float price() {
        return 25.0f;
    }

    public String name() {
        return "Vegetable Burger";
    }
}
