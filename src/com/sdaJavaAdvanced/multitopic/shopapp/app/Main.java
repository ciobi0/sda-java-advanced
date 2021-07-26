package com.sdaJavaAdvanced.multitopic.shopapp.app;

import com.sdaJavaAdvanced.multitopic.shopapp.app.repository.GroceryProductRepository;
import com.sdaJavaAdvanced.multitopic.shopapp.app.repository.GroceryProductRepositoryImpl;

public class Main {
    public static void main(String[] args) {
        GroceryProductRepository groceryProductRepository = new GroceryProductRepositoryImpl();
        System.out.println(groceryProductRepository.findByName("Pork - Side Ribs"));
    }
}
