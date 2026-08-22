# Component Price Calculation & Price History

## Overview

This project demonstrates the core pricing business logic for a component-based system.

The main focus of this implementation is:

- Calculating the total price based on component price and quantity.
- Updating a component's price.
- Maintaining price history when a component's price changes.
- Validating component prices and quantities.
- Recalculating the total price after a price change.

The implementation is intentionally kept small and focused on the core business logic rather than building the complete application.

---

## Objective

The objective is to convert the documented pricing requirements into a simple and understandable Java implementation.

The current implementation focuses on four main concepts:

1. Component
2. Component Type
3. Price Calculation
4. Price History

---

## Project Structure

```text
src
└── main
    └── java
        └── com.hero
            ├── Main.java
            └── model
                ├── Component.java
                ├── ComponentType.java
                ├── PriceCalculation.java
                └── PriceHistory.java
```
---
---
# Main WorkFlow:

Component
    ↓
Price + Quantity
    ↓
PriceCalculation
    ↓
Total Price
    ↓
Price Change
    ↓
PriceHistory
    ↓
Updated Component Price
    ↓
Recalculate
    ↓
New Total Price
