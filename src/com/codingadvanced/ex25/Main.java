package com.codingadvanced.ex25;

/**
 * Change the BasketFullException and BasketEmptyException exceptions from runtime exception type to
 * checked exception type.
 * Handle them.
 */
public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();

//        try {
//            basket.addToBasket();
//            basket.addToBasket();
//            basket.addToBasket();
//            basket.addToBasket();
//            basket.addToBasket();
//            basket.removeFromBasket();
//            basket.addToBasket();
//            basket.addToBasket();
//            basket.addToBasket();
//            basket.addToBasket();
//            basket.addToBasket();
//            basket.addToBasket();
//        } catch (BasketFullException  | BasketEmptyException e) {
//            e.printStackTrace();
//        }
        try {
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.removeFromBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
        } catch (BasketFullException e) {
            e.printStackTrace();
        } catch (BasketEmptyException e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }
    }
}
