package com.codingadvanced.ex28;

import java.util.ArrayList;
import java.util.List;

public class SdaArrayList<E> extends ArrayList<E> {

    public List<E> getEveryNthElement(int index, int skip) {
        List<E> result = new ArrayList<>();
        if (size() > index) {
            for (int i = index; i  < size(); i=i+skip+1) {
                result.add(get(i));
            }
        }
        return result;
    }
}
