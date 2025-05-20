package com.github.seif.creational.singleton;

/**
 * Singleton class for application configuration.
 */
public class AppConfig {

    private static AppConfig instance;
    private String environment;
    private String dbUrl;

    private AppConfig() {
        this.environment = "production";
        this.dbUrl = "jdbc:mysql://localhost:3306/mydb";
    }

    public static synchronized AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }
}
