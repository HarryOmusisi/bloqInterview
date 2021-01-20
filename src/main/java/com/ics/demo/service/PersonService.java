package com.ics.demo.service;

import com.ics.demo.models.Person;

import java.util.List;

public interface PersonService {
    List<Person> findAll();

    Person findById(Long id);

    Person create(Person person);

    void delete(Long personId);

    Person update(Person person);

    Person update(Long id, Person person);

}
