package com.codingadvanced.ex16;

import java.time.Duration;

public enum Runner {
    BEGINNER(Duration.ofMinutes(2), Duration.ofMinutes(5)),
    INTERMEDIATE(Duration.ofMinutes(5), Duration.ofMinutes(10)),
    ADVANCED(Duration.ofMinutes(10), Duration.ofMinutes(60));

    private Duration minimumTime;
    private Duration maximumTime;

    Runner(Duration minimumTime, Duration maximumTime) {
        this.minimumTime = minimumTime;
        this.maximumTime = maximumTime;
    }

    public static Runner gerFitnessLevel(Duration runningDuration) {
        if (runningDuration.getSeconds() > ADVANCED.maximumTime.getSeconds()) {
            System.out.println("no one can run that much!");
            return null;
        }
        if (runningDuration.getSeconds() <= ADVANCED.maximumTime.getSeconds()
                && runningDuration.getSeconds() >= ADVANCED.minimumTime.getSeconds()) {
            return ADVANCED;
        }
        if (runningDuration.getSeconds() < INTERMEDIATE.maximumTime.getSeconds()
                && runningDuration.getSeconds() >= INTERMEDIATE.minimumTime.getSeconds()) {
            return INTERMEDIATE;
        }
        if (runningDuration.getSeconds() < BEGINNER.maximumTime.getSeconds()
                && runningDuration.getSeconds() >= BEGINNER.minimumTime.getSeconds()) {
            return BEGINNER;
        }
        System.out.println("time to small");
        return null;
    }
}
