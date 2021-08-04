package com.codingadvanced.ex13;

import java.util.Objects;
import java.util.Set;

public class Car {
    private String name;
    private String model;
    private double price;
    private int yearOfManufacture;
    private Set<Manufacturer> manufacturerList;
    private EngineType engineType;

    public Car(String name, String model, double price, int yearOfManufacture,
               Set<Manufacturer> manufacturerList, EngineType engineType) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
        this.manufacturerList = manufacturerList;
        this.engineType = engineType;
    }

    public String getName() {
        return name;
    }

    public Car setName(String name) {
        this.name = name;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Car setModel(String model) {
        this.model = model;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public Car setPrice(double price) {
        this.price = price;
        return this;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public Car setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
        return this;
    }

    public Set<Manufacturer> getManufacturerList() {
        return manufacturerList;
    }

    public Car setManufacturerList(Set<Manufacturer> manufacturerList) {
        this.manufacturerList = manufacturerList;
        return this;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public Car setEngineType(EngineType engineType) {
        this.engineType = engineType;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0
                && yearOfManufacture == car.yearOfManufacture
                && name.equals(car.name)
                && model.equals(car.model)
                && manufacturerList.equals(car.manufacturerList)
                && engineType == car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, yearOfManufacture, manufacturerList, engineType);
    }
}
