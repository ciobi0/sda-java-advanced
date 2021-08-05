package com.codingadvanced.ex13;

import java.util.*;
import java.util.function.Predicate;
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
    public List<Car> getCars() {
        return new ArrayList<>(cars);
    }

    @Override
    public List<Car> getCarsWithV12engine() {
        return cars.stream()
                .filter(car -> car.getEngineType().equals(EngineType.V12))
                .collect(Collectors.toList());
    }

    @Override
    public List<Car> getCarsBefore1999() {
        return cars.stream()
                .filter(car -> car.getYearOfManufacture() < 1999)
                .collect(Collectors.toList());
    }

    @Override
    public Car getMostExpensiveCar() {
        return cars.stream().max((car1, car2) -> Double.compare(car1.getPrice(), car2.getPrice()))
                .orElse(null);
    }

    @Override
    public Car getCheapestCar() {
        return cars.stream().min((car1, car2) -> Double.compare(car1.getPrice(), car2.getPrice()))
                .orElse(null);
    }

    @Override
    public List<Car> getCarWithAtLeast3Manufacturers() {
        return cars.stream().filter(car -> car.getManufacturerList().size() >= 3)
                .collect(Collectors.toList());
    }

    @Override
    public List<Car> getCarsSortedByPrice(boolean ascending) {
        if (ascending) {
            return cars.stream()
                    .sorted((car1, car2) -> Double.compare(car1.getPrice(), car2.getPrice()))
                    .collect(Collectors.toList());
        } else {
            return cars.stream()
                    .sorted((car1, car2) -> Double.compare(car2.getPrice(), car1.getPrice()))
                    .collect(Collectors.toList());
        }
    }

    @Override
    public boolean isCarPresent(Car car) {
        return cars.contains(car);
    }

    @Override
    public List<Car> getCarsByManufacturer(Manufacturer manufacturer) {
        return cars.stream().filter(car -> car.getManufacturerList().contains(manufacturer))
                .collect(Collectors.toList());
    }

    @Override
    public List<Car> getCarsByYearOfEstablishment(Predicate<Integer> yearOfEstablishmentFilterCondition) {
        return cars.stream()
                .filter(car -> car.getManufacturerList()
                        .stream()
                        .anyMatch(manufacturer -> yearOfEstablishmentFilterCondition.test(manufacturer.getYearOfEstablishment()))
                )
                .collect(Collectors.toList());
    }


}
