package org.example;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.send("Hello World", "PC001");
    }
}