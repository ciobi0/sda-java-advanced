package com.sdaJavaAdvancedIndividualWorkSession.ex10.model;

import java.time.LocalDate;
import java.util.function.Function;
import java.util.function.Supplier;

public class GenericProduct implements Product{
    private final String productName;
    private final Supplier<Double> priceSupplier;
    private final Function<LocalDate,Boolean> availabilityFunction;

    public GenericProduct(String productName, Supplier<Double> priceSupplier, Function<LocalDate, Boolean> availabilityFunction) {
        this.productName = productName;
        this.priceSupplier = priceSupplier;
        this.availabilityFunction = availabilityFunction;
    }

    @Override
    public double getPrice() {
        return priceSupplier.get();
    }

    @Override
    public boolean isAvailable(LocalDate localDate) {
        return availabilityFunction.apply(localDate);
    }

    @Override
    public String toString() {
        return "GenericProduct{" +
                "productName='" + productName + '\'' +
                ", priceSupplier=" + priceSupplier.get() +
                '}';
    }
}
