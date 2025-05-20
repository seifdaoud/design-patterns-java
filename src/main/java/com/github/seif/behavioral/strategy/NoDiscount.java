package com.github.seif.behavioral.strategy;

public class NoDiscount implements DiscountStrategy {
    public double applyDiscount(double price) {
        return price;
    }
}
