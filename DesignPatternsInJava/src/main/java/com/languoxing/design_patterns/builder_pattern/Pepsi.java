package com.languoxing.design_patterns.builder_pattern;

public class Pepsi extends ColdDrink {
    @Override
    public float price() {
        return 35.0f;
    }

    public String name() {
        return "Pepsi";
    }
}
