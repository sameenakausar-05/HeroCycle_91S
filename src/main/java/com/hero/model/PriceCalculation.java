package com.hero.model;

import java.math.BigDecimal;
import java.util.Map;

public class PriceCalculation {

    public BigDecimal calculatePrice(
            Map<Component, Integer> components) {

        BigDecimal totalPrice = BigDecimal.ZERO;

        for (Map.Entry<Component, Integer> entry : components.entrySet()) {

            Component component = entry.getKey();
            int quantity = entry.getValue();

            BigDecimal itemPrice =
                    component.getPrice()
                             .multiply(
                                     BigDecimal.valueOf(quantity)
                             );


            totalPrice =
                    totalPrice.add(itemPrice);
            if (quantity <= 0) {
                throw new IllegalArgumentException(
                        "Quantity must be greater than zero"
                );
            }
        }

        return totalPrice;
    }

    public PriceHistory updatePrice(
            Component component,
            BigDecimal newPrice) {

        // Price cannot be negative
    	if (newPrice.compareTo(BigDecimal.ZERO) < 0) {
    	    throw new IllegalArgumentException(
    	            "Price cannot be negative"
    	    );
    	}

        BigDecimal oldPrice = component.getPrice();

        // No change in price
        if (oldPrice.compareTo(newPrice) == 0) {
            return null;
        }
        
        if (newPrice.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException(
                    "Price must be greater than zero"
            );
        }

        PriceHistory history =
                new PriceHistory(
                        component,
                        oldPrice,
                        newPrice
                );

        component.setPrice(newPrice);

        return history;
    }
}