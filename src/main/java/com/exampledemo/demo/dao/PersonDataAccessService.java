// package com.exampledemo.demo.dao;

// import java.lang.StackWalker.Option;
// import java.util.ArrayList;
// import java.util.List;
// import java.util.Optional;
// import java.util.UUID;

// import org.springframework.stereotype.Repository;

// import com.exampledemo.demo.model.Person;

// // makes it obv that this class is a repo
// @Repository("postgres")
// public class PersonDataAccessService implements PersonDao {

//     private static List<Person> DB = new ArrayList<>();

//     @Override
//     public int insertPerson(UUID id, Person person) {
//         DB.add(new Person(id, person.getName()));
//         return 1;
//     }

//     @Override
//     public List<Person> selectAllPersons() {

//         return DB;
//     }

//     @Override
//     public Optional<Person> selectedPersonById(UUID Id) {
//         return DB.stream().filter(person -> person.getId().equals(Id)).findFirst();
//     }

//     @Override
//     public int deletePersonById(UUID id) {
//         Optional<Person> personMaybe = selectedPersonById(id);

//         if (personMaybe.isEmpty()) {
//             return 0;
//         }
//         ;

//         DB.remove(personMaybe.get());

//         return 1;
//     }

//     @Override
//     public int updatePersonById(UUID id, Person update) {
//         return selectedPersonById(id).map(person -> {
//             int indexOfPersonToUpdate = DB.indexOf(person);

//             if(indexOfPersonToUpdate>=0){
//                 DB.set(indexOfPersonToUpdate, new Person(id, update.getName()));
//                 return 1;
//             };
//             return 0;
//         }).orElse(0);
//     }

// }
