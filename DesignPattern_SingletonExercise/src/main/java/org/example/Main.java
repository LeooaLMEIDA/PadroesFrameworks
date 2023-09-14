package org.example;

public class Main {
    public static void main(String[] args) {

        ConfigManager manager = ConfigManager.getInstance();
        manager.set("usuar", "Leonardo");

        ConfigManager otherManager = ConfigManager.getInstance();
        System.out.println(otherManager.get("usuar"));
    }
}