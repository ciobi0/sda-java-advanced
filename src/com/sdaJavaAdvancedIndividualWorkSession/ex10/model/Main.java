package com.sdaJavaAdvancedIndividualWorkSession.ex10.model;

import com.sdaJavaAdvancedIndividualWorkSession.ex10.repository.Basket;

import java.time.LocalDate;
import java.util.List;

/**
 * Create a shop imitating application .
 * Create Basket class that will allow for adding , removing and retrieving all items in the basket.
 * Each item is an instance of Product interface that defines two methods ,
 * -one to get price of an item and
 * -one to check for availability based on a provided date
 * <p>
 * Create GenericProduct class that implements Product interface and will have supplier
 * supplying price and function checking availability based on a provided date for a particular product
 * <p>
 * Make sure that Basket does not expose its internal list storing products ( meaning it will
 * not return a reference to its internal list but rather a copy ), all operations on that list
 * should be done through Basket methods.
 */
public class Main {
    public static void main(String[] args) {

        Product milk = new GenericProduct("milk",() -> 10.00, localDate -> localDate.isAfter(LocalDate.now()));
        Product bread = new GenericProduct("bread",() -> 0.5, localDate -> true);
        System.out.println(milk.getPrice());
        System.out.println(milk.isAvailable(LocalDate.of(2021, 8, 16)));

        Basket<Product> basket = new Basket<>();
        basket.addProduct(milk,25);
        basket.addProduct(bread,125);

        List<Product> products = basket.getAllProducts();
        System.out.println("inside products: " + products);
        products.remove(milk);
        System.out.println("inside products : " + products);
        System.out.println("inside basket: "+basket.getAllProducts());
        basket.removeProduct(milk,10);
        System.out.println("inside basket: "+basket.getAllProducts());
        basket.removeProduct(milk,20);
        System.out.println("inside basket: "+basket.getAllProducts());


    }
}
