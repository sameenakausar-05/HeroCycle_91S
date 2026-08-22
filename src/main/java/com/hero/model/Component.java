package com.hero.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "component")
public class Component {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private ComponentType type;

    private BigDecimal price;

    public Component() {
    }

    public Component(
            String name,
            ComponentType type,
            BigDecimal price) {

        this.name = name;
        this.type = type;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ComponentType getType() {
        return type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}