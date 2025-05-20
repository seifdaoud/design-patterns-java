package com.github.seif.structural.decorator;

public class MilkDecorator implements Beverage {
    private final Beverage beverage;

    public MilkDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", milk";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.5;
    }
}
