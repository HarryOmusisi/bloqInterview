package com.ics.demo.controller;

import com.ics.demo.models.Actor;
import com.ics.demo.models.Movie;
import com.ics.demo.models.Person;
import com.ics.demo.service.PersonService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "person")
public class PersonController {
    private final PersonService personService;
}