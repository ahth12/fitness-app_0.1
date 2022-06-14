package com.fitness.app.controller;

import com.fitness.app.model.Person;
import com.fitness.app.model.TestData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Comparator;
import java.util.List;

@Slf4j
@Controller
public class PersonController {

    @GetMapping("/person")
    public String getPersonInformation(Model model){
        Person person = new Person();
        TestData testData = new TestData();
        List<Person> personList = testData.getPersonList();
        testData.getPersonList().stream()
                .map(u -> new Person(u.getId(), u.getFirstName(), u.getSecondName(), u.getAge()))
                .forEach(x -> model.addAttribute(x.getFirstName(), x));
        model.addAttribute("personList", personList);
        return "personView";
    }
}
