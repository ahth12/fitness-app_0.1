package com.fitness.app.model;

import lombok.Data;

import java.util.List;
import java.util.Random;

@Data
public class Workout {
    private final int id;
    private List<Exercise> exerciseList;

    public Workout() {
        this.id = new Random().nextInt();
    }

    public Workout(int id) {

        this.id = id;
    }

    public Workout(int id, List<Exercise> exerciseList) {
        this.id = id;
        this.exerciseList = exerciseList;
    }

    public List<Exercise> getExerciseList() {
        return exerciseList;
    }

    public void setExerciseList(List<Exercise> exerciseList) {
        this.exerciseList = exerciseList;
    }
}
