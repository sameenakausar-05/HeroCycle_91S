package com.hero;
import com.hero.model.Component;
import com.hero.model.ComponentType;
import com.hero.model.PriceCalculation;
import com.hero.model.PriceHistory;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Component frame =
                new Component(
                        "Basic Frame",
                        ComponentType.FRAME,
                        new BigDecimal("5000")
                );

        Component gear =
                new Component(
                        "Gear X",
                        ComponentType.GEAR,
                        new BigDecimal("2500")
                );

        Component tyre =
                new Component(
                        "Tyre P",
                        ComponentType.TYRE,
                        new BigDecimal("230")
                );

        Map<Component, Integer> components =
                new HashMap<>();

        components.put(frame, 1);
        components.put(gear, 1);
        components.put(tyre, 2);

        PriceCalculation priceCalculation =
                new PriceCalculation();

        BigDecimal total =
                priceCalculation.calculatePrice(
                        components
                );
        
        System.out.println(
                "Total Price = ₹" + total
        );
        System.out.println("Current Price = ₹" + tyre.getPrice());
        
     // Scenario 1: Change tyre price
        System.out.println("---- Price Change ----");

        BigDecimal newPrice = new BigDecimal("250");

        PriceHistory history =
                priceCalculation.updatePrice(
                        tyre,
                        newPrice
                );

        if (history != null) {

            System.out.println(
                    "Old Price = ₹" +
                    history.getOldPrice()
            );

            System.out.println(
                    "New Price = ₹" +
                    history.getNewPrice()
            );

            System.out.println(
                    "Current Price = ₹" +
                    tyre.getPrice()
            );
        }

        BigDecimal newTotal =
                priceCalculation.calculatePrice(components);

        System.out.println(
                "New Total Price = ₹" + newTotal
        );
    }
}