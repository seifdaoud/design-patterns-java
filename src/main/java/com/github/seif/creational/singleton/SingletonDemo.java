package com.github.seif.creational.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        AppConfig config1 = AppConfig.getInstance();
        AppConfig config2 = AppConfig.getInstance();

        System.out.println("Config 1: " + config1.getDbUrl());
        System.out.println("Config 2: " + config2.getDbUrl());

        config1.setDbUrl("jdbc:mysql://localhost:3306/updated");

        System.out.println("Config 2 après modification: " + config2.getDbUrl());
        System.out.println("config1 == config2 ? " + (config1 == config2));
    }
}
