package com.defaultMethods;

import java.util.Comparator;

public class SortByRankThenSuit implements Comparator<Card> {

    @Override
    public int compare(Card firstCard, Card secondCard) {
        int compValue =
                firstCard.getRank().value() - secondCard.getRank().value();
        if (compValue != 0){
            return compValue;
        } else
            return firstCard.getSuit().value() - secondCard.getSuit().value();
    }
}
