// package com.exampledemo.demo.dao;

// import java.util.List;
// import java.util.Optional;
// import java.util.UUID;

// import com.exampledemo.demo.model.Person;

// public interface PersonDao {
//     // allows to insert the person
//     int insertPerson(UUID id, Person person);

//     default int insertPerson(Person person) {
//         UUID id = UUID.randomUUID();
//         return insertPerson(id, person);
//     }

//     List<Person> selectAllPersons();

//     Optional<Person> selectedPersonById(UUID Id);

//     int deletePersonById(UUID id);

//     int updatePersonById(UUID id, Person person);

// }
