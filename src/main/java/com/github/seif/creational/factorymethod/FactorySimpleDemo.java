package com.github.seif.creational.factorymethod;

public class FactorySimpleDemo {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.createShape("circle");
        Shape shape2 = ShapeFactory.createShape("square");

        shape1.draw(); // Drawing a Circle
        shape2.draw(); // Drawing a Square
    }
}
