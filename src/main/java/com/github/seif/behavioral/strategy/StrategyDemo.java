package com.github.seif.behavioral.strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        PriceCalculator calculator = new PriceCalculator(new NoDiscount());

        double price = 100.0;
        System.out.println("No discount: " + calculator.calculatePrice(price));

        calculator.setStrategy(new SeasonalDiscount());
        System.out.println("Seasonal discount: " + calculator.calculatePrice(price));

        calculator.setStrategy(new ClearanceDiscount());
        System.out.println("Clearance discount: " + calculator.calculatePrice(price));
    }
}
