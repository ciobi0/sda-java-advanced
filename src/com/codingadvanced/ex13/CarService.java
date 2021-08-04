package com.codingadvanced.ex13;

import java.util.Set;

public interface CarService {
    /**
     * Adding cars to the list.
     *
     * @param cars, a set of cars that will be added to the service
     */
    void addCar(Set<Car> cars);
}
