package com.codingadvanced.ex13justme;

import java.util.HashSet;
import java.util.Set;

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
 * 12.returning the list of cars manufactured by the manufacturer with the year of establishment <,>, <=,> =,
 * =,! = from the
 */

public class Main {
    public static void main(String[] args) {
        Manufacturer manufacturer1 = new Manufacturer("audi", 1997, "Germany");
        Manufacturer manufacturer11 = new Manufacturer("audi", 2000, "France");
        Manufacturer manufacturer12 = new Manufacturer("audi", 2005, "Italy");

        Manufacturer manufacturer2 = new Manufacturer("ford", 2000, "USA");
        Manufacturer manufacturer22 = new Manufacturer("ford", 2005, "England");

        Manufacturer manufacturer3 = new Manufacturer("toyota", 2005, "Japan");
        Manufacturer manufacturer33 = new Manufacturer("toyota", 2015, "Spain");

        Set<Manufacturer> audiManufacturerSet = new HashSet<>();
        audiManufacturerSet.add(manufacturer1);
        audiManufacturerSet.add(manufacturer11);
        audiManufacturerSet.add(manufacturer12);

        Set<Manufacturer> fordManufacturerSet = new HashSet<>();
        fordManufacturerSet.add(manufacturer2);
        fordManufacturerSet.add(manufacturer22);

        Set<Manufacturer> toyotaManufacturerSet = new HashSet<>();
        toyotaManufacturerSet.add(manufacturer3);
        toyotaManufacturerSet.add(manufacturer33);


        Car car1 = new Car(
                "audi",
                "a8",
                30000,
                2021,
                audiManufacturerSet,
                EngineType.V12);
        Car car2 = new Car(
                "ford",
                "ka",
                5000,
                1998,
                fordManufacturerSet,
                EngineType.S3);
        Car car3 = new Car(
                "toyota",
                "rav4",
                25000,
                2020,
                toyotaManufacturerSet,
                EngineType.V12);
        Set<Car> cars = new HashSet<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        CarService service = new CarServiceImpl();
        service.addCar(cars);
        System.out.println(service.getCarsWithV12engine());
        System.out.println(service.getCarsBefore1999());
        System.out.println(service.getMostExpensiveCar());
        System.out.println(service.getCheapestCar());
        System.out.println(service.getCarWithAtLeast3Manufacturers());
        System.out.println(service.getAllCarsSorted("ascending"));

    }
}
