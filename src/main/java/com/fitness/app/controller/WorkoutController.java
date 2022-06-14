package com.fitness.app.controller;

import com.fitness.app.model.Exercise;
import com.fitness.app.model.TestData;
import com.fitness.app.model.Workout;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/start")
public class WorkoutController {

    @GetMapping
    public String showExercisesList(Model model){
        model.addAttribute("workout", new Workout((int) Math.random()));
        List<Exercise> exercises = new TestData().getExerciseList();
        model.addAttribute("exercises", exercises);
        return "workoutView";
    }

    @PostMapping
    public String createWorkout(Workout workout){
        //to do
        log.info("workout submitted" + workout);
        return "redirect:/start";
    }
}
