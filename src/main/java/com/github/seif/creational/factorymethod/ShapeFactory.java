package com.github.seif.creational.factorymethod;

public class ShapeFactory {
    public static Shape createShape(String type) {
        if ("circle".equalsIgnoreCase(type)) {
            return new Circle();
        } else if ("square".equalsIgnoreCase(type)) {
            return new Square();
        } else {
            throw new IllegalArgumentException("Unknown shape: " + type);
        }
    }
}
