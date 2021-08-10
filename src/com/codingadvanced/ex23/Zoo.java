package com.codingadvanced.ex23;

import java.util.*;

public class Zoo {
    Map<String, Integer> numberOfAnimalsBySpecies = new HashMap<>();

    public int getNumberOfAllAnimals() {
        return numberOfAnimalsBySpecies.values()
                .stream()
                .reduce(0, (currentValue, existingValue) -> currentValue + existingValue);
    }

    public Map<String, Integer> getAnimalsCount() {
        return numberOfAnimalsBySpecies;
    }

    public void addAnimals(String species, int count) {
        if (numberOfAnimalsBySpecies.containsKey(species)) {
            int newNumber = numberOfAnimalsBySpecies.get(species) + count;
            numberOfAnimalsBySpecies.put(species, newNumber);
        } else {
            numberOfAnimalsBySpecies.put(species, count);
        }
    }

    public Map<String, Integer> getAnimalsCountSorted() {
        LinkedHashMap<String, Integer> sortedAnimalsByCount = new LinkedHashMap<>();

//        numberOfAnimalsBySpecies.entrySet().stream()
//                .sorted((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? -1 : 1)
//                .forEach(entry -> sortedAnimalsByCount.put(entry.getKey(), entry.getValue()));
//
//        return sortedAnimalsByCount;
    numberOfAnimalsBySpecies.entrySet().stream()
            .sorted((entry1, entry2) -> Integer.compare(entry2.getValue(), entry1.getValue()))
            .forEach(entry -> sortedAnimalsByCount.put(entry.getKey(), entry.getValue()));
    return sortedAnimalsByCount;
    }


}
