package com.sdaJavaAdvanced.concurrency.exercise2;

import com.sdaJavaAdvanced.concurrency.exercise2.client.ClientDeleter;
import com.sdaJavaAdvanced.concurrency.exercise2.client.ClientWriter;
import com.sdaJavaAdvanced.concurrency.exercise2.repository.PersonRepository;

//##### Concurrency Exercise 2
//- Make a "Person" class having a name, id, address and phone number.
//- Make a class holding a list of persons that can search by any of the previous attributes.
//- It must be designed to search quickly even with a very big number of persons, so use Maps efficiently.
//- To accomplish this goal you will need a separate Map for each attribute, and different Maps may be of different types, though they must point to the same Person objects.
//- Methods that insert or delete a person must not expose their partial results (i.e. the new Person must not be searchable by any Map until it has been inserted in all Maps).
//- Tip: using synchronized blocks should be enough.
//- Create a new Client Thread that should randomly add new   persons after a given timeout
//- Create a new Client Thread that should randomly search for attributes after a given timeout
//- Create a new Client Thread that should randomly delete persons after a given timeout
//- In the main class we should start 2 of each client and see how the application is behaved.
public class Main {
    public static final PersonRepository PERSON_REPOSITORY = new PersonRepository(); //constant variable

    public static void main(String[] args) {
        for (int i=0; i<5; i++){
            new ClientWriter().start();
        }
        for (int i=0; i<5; i++){
            new ClientDeleter().start();
        }
    }
}
