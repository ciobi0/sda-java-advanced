package com.codingadvanced.ex13;

import java.util.*;

/**
 * Create a CarService class that will contain a list of cars and implement the following methods:
 * 1.adding cars to the list,
 * 2.removing a car from the list,
 * 3.returning a list of all cars,
 * 4.returning cars with a V12 engine,
 * 5.returning cars produced before 1999,
 * 6.returning the most expensive car,
 * 7.returning the cheapest car,
 * 8.returning the car with at least 3 manufacturers,
 * 9.returning a list of all cars sorted according to the passed parameter: ascending / descending,
 * 10.checking if a specific car is on the list,
 * 11.returning a list of cars manufactured by a specific manufacturer,
 * 12.returning the list of cars manufactured by the manufacturer with
 * the year of establishment <,>, <=,> =, =,! = from the
 */

public class Main {
    public static void main(String[] args) {

        CarService carService = new CarServiceImpl();

        Manufacturer volvo = new Manufacturer("Volvo", 1980, "Romania");
        Manufacturer vw = new Manufacturer("Volkswagen", 1985, "Romania");
        Manufacturer audi = new Manufacturer("Audi", 1995, "Germany");
        Manufacturer dacia = new Manufacturer("Dacia", 2006, "Romania");

        Car carVolvo = new Car(
                "volvo",
                "sedan",
                25000,
                1985,
                new HashSet<>(Arrays.asList(volvo)),
                EngineType.V12
        );

        Car carVW = new Car(
                "Volkswagen",
                "hatchback",
                18000,
                2003,
                new HashSet<>(Arrays.asList(vw)),
                EngineType.S3
        );

        Car carAudi = new Car(
                "Audi",
                "a4",
                15000,
                2011,
                new HashSet<>(Arrays.asList(audi)),
                EngineType.V6
        );

        Car carDacia = new Car(
                "Dacia",
                "1300",
                5000,
                1999,
                new HashSet<>(Arrays.asList(dacia)),
                EngineType.S4
        );

        carService.addCar(new HashSet<>(Arrays.asList(carVolvo, carDacia, carAudi, carVW)));

        carService.getCars().forEach(System.out::println);
        System.out.println("-----------------");
        carService.getCarsWithV12engine().forEach(System.out::println);
        System.out.println("-----------------");
        carService.getCarsBefore1999().forEach(System.out::println);
        System.out.println("-----------------");
        System.out.println(carService.getMostExpensiveCar());
        System.out.println("-----------------");
        System.out.println(carService.getCheapestCar());
        System.out.println("-----------------");
        carService.getCarWithAtLeast3Manufacturers().forEach(System.out::println);
        System.out.println("-----------------");
        carService.getCarsSortedByPrice(true).forEach(System.out::println);
        System.out.println("-----------------");
        System.out.println(carService.isCarPresent(carDacia));
        System.out.println("-----------------");
        carService.getCarsByManufacturer(dacia).forEach(System.out::println);
        System.out.println("-----------------");
        carService.getCarsByYearOfEstablishment(yearOfEstablishment -> yearOfEstablishment > 2005);

    }
}
