package com.codingadvanced.ex13;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

/**
 * Entity that handles the car operations
 */
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
     * Returning all cars
     *
     * @return, all the existing cars
     */
    List<Car> getCars();

    /**
     * Returns  all cars that have a V12 engine
     *
     * @return all exixting cars with filtered cars by condition V12 engine
     */
    List<Car> getCarsWithV12engine();

    /**
     * Returns cars produced before 1999
     *
     * @return, all cars filtered by condition year before 1999
     */
    List<Car> getCarsBefore1999();

    /**
     * Returns the most expensive car or null if no cars
     *
     * @return, car with the highest price
     */
    Car getMostExpensiveCar();

    /**
     * Returns the cheapest car in the service or null if no cars
     *
     * @return a car with the lowest price
     */
    Car getCheapestCar();

    /**
     * Returns a car with at least 3 manufacturers
     *
     * @return a car
     */
    List<Car> getCarWithAtLeast3Manufacturers();

    /**
     * Returns all car sorted by price ascending / descending
     *
     * @param ascending, if true, otherwise  descending
     * @return
     */
    List<Car> getCarsSortedByPrice(boolean ascending);

    /**
     * Check if a specific car exists in list
     *
     * @param car, that will be checked
     * @return true if car is present or false if not present
     */
    boolean isCarPresent(Car car);

    /**
     * Returns all car by a specific manufacturer
     * @param manufacturer, name of the manufacturer that will be searched for
     * @return a list of cars filtered by given criteria
     */
    List<Car> getCarsByManufacturer(Manufacturer manufacturer);

    /**
     * returning the list of cars manufactured by the manufacturer with
     * the year of establishment <,>, <=,> =, =,! =
     * @param yearOfEstablishmentFilterCondition filter condition for year of establishment
     * @return the list of cars manufactured by the manufacturer with
     *      * the year of establishment <,>, <=,> =, =,! =
     */
    List<Car> getCarsByYearOfEstablishment(Predicate<Integer> yearOfEstablishmentFilterCondition );
}
