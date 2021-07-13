package com.sdaJavaAdvanced.generics.exercise3.repository;

import com.sdaJavaAdvanced.generics.exercise3.model.Person;

public class PersonRepository extends IdentifiableRepository<Person>{
    public Person getPersonByName(String name){
        for (Person person : items){
            if (person.getName().equals(name)){
                return person;
            }
        }
        return null;
    }
}
