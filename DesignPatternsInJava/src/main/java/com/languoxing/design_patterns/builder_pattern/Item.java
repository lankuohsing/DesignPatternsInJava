package com.languoxing.design_patterns.builder_pattern;

public interface Item {
    public String name();

    public Packing packing();

    public float price();
}
