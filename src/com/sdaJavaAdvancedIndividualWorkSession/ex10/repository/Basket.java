package com.sdaJavaAdvancedIndividualWorkSession.ex10.repository;

import com.sdaJavaAdvancedIndividualWorkSession.ex10.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Basket<T extends Product> {
    private final Map<T, AtomicInteger> products = new HashMap<>();

    public void addProduct(T item, Integer quantity) {
        if (products.containsKey(item)) {
            products.get(item).getAndAdd(quantity);
        } else {
            products.put(item, new AtomicInteger(quantity));
        }
    }

    public void removeProduct(T item, Integer quantity) {
        if (products.containsKey(item) && products.get(item).get()<=quantity){
            products.remove(item);
        } else if (products.containsKey(item)){
            products.get(item).getAndAdd(-quantity);
        }
    }

    public List<T> getAllProducts() {
        return new ArrayList<>(products.keySet());
    }

}
