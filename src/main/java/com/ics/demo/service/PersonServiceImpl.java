package com.ics.demo.service;

import com.ics.demo.NotFoundException;
import com.ics.demo.models.Actor;
import com.ics.demo.repositories.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService implements PersonService{

    private final PersonService personService;

    public PersonServiceImpl(PersonRepository personRepository)
    {
        this.personService=personRepository;
    }


    @Override
    public List<Person> findAll() {
        return personService.findAll();
    }

    @Override
    public Person findById(Long id) {
        return personRepository.findById(id).orElseThrow(()->
                new NotFoundException("No record with id " + id + " found"));
    }

    @Override
    public Person create(Person person) {

        return personrepository.save(person);
    }

    @Override
    public void delete(Long personId) {
        personRepository.deleteById(personId);
    }

    @Override
    public Person update(Person person) {
        return null;
    }

}
