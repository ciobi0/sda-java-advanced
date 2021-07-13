//Create the Identifiable interface with the fallowing method:
//- getId: String
//Create the IdentifiableRepository class, which will be responsible for:
//- adding objects
//- searching for objects with the indicated id
//- removing objects based on the provided id
//Create 3 child classes for the Identifiable class:
//- Car
//- Person
//- MobilePhone
//Test the IdentifiableRepository in a main class.

package com.sdaJavaAdvanced.generics.exercise3.repository;

import com.sdaJavaAdvanced.generics.exercise3.model.Identifiable;

import java.util.ArrayList;
import java.util.List;

public class IdentifiableRepository<T extends Identifiable> {

    protected List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public T getItemById(String id) {
        for (T item : items) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }

    public void removeItemById(String id) {
        T itemToBeRemoved = getItemById(id);
        if (itemToBeRemoved != null) {
            items.remove(itemToBeRemoved);
        }
    }

}
