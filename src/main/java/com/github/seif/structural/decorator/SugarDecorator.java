package com.github.seif.structural.decorator;

public class SugarDecorator implements Beverage {
    private final Beverage beverage;

    public SugarDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", sugar";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.2;
    }
}
