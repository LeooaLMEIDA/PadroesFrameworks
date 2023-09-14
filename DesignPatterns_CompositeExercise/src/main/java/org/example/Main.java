package org.example;

import org.example.products.Juice;
import org.example.products.Toxies;

public class Main {
    public static void main(String[] args) {
        DeliveryService deliveryService = new DeliveryService();
        deliveryService.setupOrder(
            new CompositeBox(new Juice("SUCO", 12)),
            new CompositeBox(new Toxies("TOXICO 1", 25),
                    new Toxies("CREATINA", 90)),
            new Juice("TREMBOLONA", 1400)
        );
        System.out.println(deliveryService.calculateOrderPrice());
    }
}