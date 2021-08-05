package com.codingadvanced.ex13justme;

import java.util.*;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {
    private Set<Car> cars = new HashSet<>();

    @Override
    public void addCar(Set<Car> cars) {
        this.cars.addAll(cars);
    }

    @Override
    public void removeCar(Car car) {
        this.cars.remove(car);
    }

    @Override
    public Set<Car> allCars() {
        return this.cars;
    }

    @Override
    public Set<Car> getCarsWithV12engine() {
        return cars.stream()
                .filter(car -> car.getEngineType().equals(EngineType.V12))
                .collect(Collectors.toSet());
    }

    @Override
    public Set<Car> getCarsBefore1999() {
        return cars.stream()
                .filter(car -> car.getYearOfManufacture() < 1999)
                .collect(Collectors.toSet());
    }

    @Override
    public Optional<Car> getMostExpensiveCar() {
        return cars.stream().max(Comparator.comparingDouble(Car::getPrice));
    }

    @Override
    public Optional<Car> getCheapestCar() {
        return cars.stream().min(Comparator.comparingDouble(Car::getPrice));
    }

    @Override
    public Optional<Car> getCarWithAtLeast3Manufacturers() {
        return cars.stream().filter(car -> car.getManufacturerList().size() >= 3)
                .findAny();
    }

    @Override
    public List<Car> getAllCarsSorted(String condition) {
       return null;
    }


}
