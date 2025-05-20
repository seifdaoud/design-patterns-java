package com.github.seif.structural.decorator;

public class SimpleCoffee implements Beverage {
    @Override
    public String getDescription() {
        return "Simple coffee";
    }

    @Override
    public double getCost() {
        return 2.0;
    }
}
