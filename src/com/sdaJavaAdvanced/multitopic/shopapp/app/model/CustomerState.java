package com.sdaJavaAdvanced.multitopic.shopapp.app.model;

public enum CustomerState {
    NEW("New", false),
    ACTIVE("Active", true),
    CLOSED("Closed", false),
    BANNED("Banned", false);

    String prettyName;
    boolean isShoppingActive;

    CustomerState(String prettyName, boolean isShoppingActive) {
        this.prettyName = prettyName;
        this.isShoppingActive = isShoppingActive;
    }

    @Override
    public String toString() {
        return prettyName;
    }

    public boolean isShoppingActive() {
        return isShoppingActive;
    }
}
