package com.fitness.app.model;

import java.util.Arrays;
import java.util.List;

public final class TestData {
    private final List<Person> personList = Arrays.asList(
      new Person(1, "test", "test", 25),
            new Person(2, "test2", "test2", 21),
            new Person(3, "test3", "test3", 24),
            new Person(4, "test", "test", 20)
    );
    private final List<Exercise> exerciseList = Arrays.asList(
            new Exercise(1, "Squat"),
            new Exercise(2, "Bench"),
            new Exercise(3, "Deadlift"),
            new Exercise(4, "Armbench"),
            new Exercise(5, "Biceps")
    );
    public List<Person> getPersonList() {
        return personList;
    }

    public List<Exercise> getExerciseList() {
        return exerciseList;
    }
}
