package com.exampledemo.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.exampledemo.demo.dao.PersonDao;
import com.exampledemo.demo.model.Person;


@Service
public class PersonService {
    
    private final PersonDao personDao;

    @Autowired
    public PersonService(@Qualifier("fakeDao") PersonDao personDao){
        this.personDao = personDao;
    };

    public int addPerson(Person person){
        return  personDao.insertPerson(person);
    }

    public List<Person> getAllPersons(){
        return personDao.selectAllPersons();
    }

}
