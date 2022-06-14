package com.fitness.app;

import com.fitness.app.model.Person;
import com.fitness.app.model.TestData;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {
        TestData testData = new TestData();
        List<Person> PersonList = new ArrayList<>();
        testData.getPersonList().stream()
                .sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getFirstName))
                .map(u -> new Person(u.getId(), u.getFirstName(), u.getSecondName(), u.getAge()))
                .forEach(PersonList::add);
        LinkedList<Person> linkedList = PersonList.stream().collect(Collectors.toCollection(LinkedList::new));
        PersonList.stream().forEach(System.out::println);

    }
}
