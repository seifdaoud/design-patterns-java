package com.github.seif.behavioral.strategy;

public class ClearanceDiscount implements DiscountStrategy {
    public double applyDiscount(double price) {
        return price * 0.5; // 50% off
    }
}
