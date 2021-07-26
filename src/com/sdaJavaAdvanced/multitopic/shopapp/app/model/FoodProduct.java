package com.sdaJavaAdvanced.multitopic.shopapp.app.model;

import java.time.Instant;
import java.util.Date;

public abstract class FoodProduct implements Sellable {
    private static final String FOOD_CATEGORY = "FOOD";
    private static final Date EXPIRATION_DATE_CHECK = Date.from(Instant.now());
    private Date expirationDate;
    private boolean isBio;
    private String countryOfOrigin;

    public FoodProduct(Date expirationDate, boolean isBio, String countryOfOrigin) {
        //if (expirationDate.before(Date.from(Instant.now()))) {
        if (expirationDate.before(EXPIRATION_DATE_CHECK)) {
            throw new IllegalArgumentException("product is expired");
        }
        this.expirationDate = expirationDate;
        this.isBio = isBio;
        this.countryOfOrigin = countryOfOrigin;
    }

    @Override
    public String getProductCategory() {
        return FOOD_CATEGORY;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public boolean isBio() {
        return isBio;
    }

    public void setBio(boolean bio) {
        isBio = bio;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }
}
