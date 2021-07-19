package com.sdaJavaAdvanced.concurrency.exercise2.repository;

import com.sdaJavaAdvanced.concurrency.exercise2.model.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PersonRepository {

    private final Map<Integer, Object> locks = new ConcurrentHashMap<>();
    private final Map<Integer, Person> personsById = new HashMap<>();
    private final Map<String, Integer> personIdsByName = new HashMap<>();
    private final Map<String, Integer> personIdsByAddress = new HashMap<>();
    private final Map<String, Integer> personIdsByPhoneNumber = new HashMap<>();

    public void addPerson(Person person) {
        locks.putIfAbsent(person.getId(), new Object());
        synchronized (locks.get(person.getId())) {
            personsById.put(person.getId(), person);
            personIdsByName.put(person.getName(), person.getId());
            personIdsByAddress.put(person.getAddress(), person.getId());
            personIdsByPhoneNumber.put(person.getPhoneNumber(), person.getId());
        }
    }

    public void deletePersonById(Integer id) {
        locks.putIfAbsent(id, new Object());
        synchronized (locks.get(id)) {
            Person person = personsById.get(id);
            if (person != null) {
                personIdsByName.remove(person.getName());
                personIdsByAddress.remove(person.getName());
                personIdsByPhoneNumber.remove(person.getName());
                personsById.remove(person.getName());
            }
        }
    }

    public Person searchPersonByName(String name) {
        Integer id = personIdsByName.get(name);
        if (id != null) {
            locks.putIfAbsent(id, new Object());
            synchronized (locks.get(id)) {
                id = personIdsByName.get(name);
                if (id != null) {
                    Person person = personsById.get(id);
                    return person;
                } else {
                    return null;
                }
            }
        } else {
            return null;
        }
    }

    public int getSize(){
        return personsById.size();
    }
}


