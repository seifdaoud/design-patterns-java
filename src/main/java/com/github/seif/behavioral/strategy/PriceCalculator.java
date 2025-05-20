package com.github.seif.behavioral.strategy;

public class PriceCalculator {
    private DiscountStrategy strategy;

    public PriceCalculator(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculatePrice(double basePrice) {
        return strategy.applyDiscount(basePrice);
    }

    public void setStrategy(DiscountStrategy strategy) {
        this.strategy = strategy;
    }
}
