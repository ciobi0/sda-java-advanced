package com.codingadvanced.ex13justme;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface CarService {
    /**
     * Adding cars to the list.
     *
     * @param cars, a set of cars that will be added to the service
     */
    void addCar(Set<Car> cars);

    /**
     * Removing a car from the list
     *
     * @param car, car to be removed from the list
     */
    void removeCar(Car car);

    /**
     * Returning a list of all cars
     *
     * @return, a Set containing all cars
     */
    Set<Car> allCars();

    /**
     * Returns a set with all cars that have a V12 engine
     *
     * @return a Set with filtered cars by condition V12 engine
     */
    Set<Car> getCarsWithV12engine();

    /**
     * Returns cars produced before 1999
     *
     * @return, a set of cars filtered by condition
     */
    Set<Car> getCarsBefore1999();

    /**
     * Returns the most expensive car
     *
     * @return, car with the highest price
     */
    Optional<Car> getMostExpensiveCar();

    /**
     * Returns cheapest car in the service
     *
     * @return a car with the lowest price
     */
    Optional<Car> getCheapestCar();

    /**
     * Returns a car with at least 3 manufacturers
     *
     * @return a car
     */
    Optional<Car> getCarWithAtLeast3Manufacturers();

    /**
     * Returns all car sorted by parameter: ascending / descending
     *
     * @param condition, for sorting: ascending / descending
     * @return
     */
    List<Car> getAllCarsSorted(String condition);
}
