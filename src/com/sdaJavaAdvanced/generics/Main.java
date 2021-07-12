package com.sdaJavaAdvanced.generics;

import com.sdaJavaAdvanced.generics.model.Person;
import com.sdaJavaAdvanced.generics.repository.IdentifiableRepository;

public class Main {
    public static void main(String[] args) {
        IdentifiableRepository<Person> personRepository = new IdentifiableRepository<>();
        Person person=new Person();
        person.setCNP("185445887");
        person.setName("John");
        personRepository.addItem(person);
        System.out.println(personRepository.getItemById("4584"));
        System.out.println(personRepository.getItemById("185445887"));
        personRepository.removeItemById("185445887");
        System.out.println(personRepository.getItemById("185445887"));
    }
}
