package com.hero.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;


public class PriceHistory {


    private Long id;

    private Component component;

    private BigDecimal oldPrice;

    private BigDecimal newPrice;

    private LocalDateTime changedAt;

    public PriceHistory() {
    }

    public PriceHistory(
            Component component,
            BigDecimal oldPrice,
            BigDecimal newPrice) {

        this.component = component;
        this.oldPrice = oldPrice;
        this.newPrice = newPrice;
        this.changedAt = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public Component getComponent() {
        return component;
    }

    public BigDecimal getOldPrice() {
        return oldPrice;
    }

    public BigDecimal getNewPrice() {
        return newPrice;
    }

    public LocalDateTime getChangedAt() {
        return changedAt;
    }
}