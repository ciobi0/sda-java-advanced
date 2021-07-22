package com.sdaJavaAdvanced.shopapp.app.model;

import java.time.Instant;
import java.util.Date;

public class GroceryProduct extends FoodProduct {
    private String id;
    private Double price;
    private String currency;
    private String name;
    private String description;

    public GroceryProduct(
            Date expirationDate,
            boolean isBio,
            String countryOfOrigin,
            String id,
            double price,
            String currency,
            String name,
            String description
    ) {
        super(expirationDate, isBio, countryOfOrigin);
        this.id = id;
        if (this.price != null && this.price > 0) {
            this.price = price;
        }else{
            throw new IllegalArgumentException("invalid price");
        }
        this.currency = currency;
        this.name = name;
        this.description = description;
    }

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
