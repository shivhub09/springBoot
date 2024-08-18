package com.exampledemo.demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.exampledemo.demo.model.Person;
import com.exampledemo.demo.service.PersonService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RequestMapping("api/v1/person")
@RestController
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/addPerson")
    public void addPerson(@RequestBody Person person) {
        personService.addPerson(person);
    }
    
    @GetMapping("/fetchPerson")
    public List<Person> getAllPersons(){
        return personService.getAllPersons();
    }
    



}
