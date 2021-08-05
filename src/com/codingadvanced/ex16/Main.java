package com.codingadvanced.ex16;

import java.time.Duration;

/**
 * Create an enum Runner class with constants BEGINNER, INTERMEDIATE, ADVANCED. Enum should have two
 * parameters:
 * •minimum time of running a marathon in minutes
 * •maximum running time of the marathon in minutes
 * In addition, the Runner enum should contain the static getFitnessLevel() method, which takes any time
 * result of a marathon run, and as a result should return a specific Runner object based on the given time.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(Runner.gerFitnessLevel(Duration.ofMinutes(1)));
        System.out.println(Runner.gerFitnessLevel(Duration.ofMinutes(3)));
        System.out.println(Runner.gerFitnessLevel(Duration.ofMinutes(7)));
        System.out.println(Runner.gerFitnessLevel(Duration.ofMinutes(20)));
        System.out.println(Runner.gerFitnessLevel(Duration.ofMinutes(120)));




    }
}
