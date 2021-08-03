package com.codingadvanced.ex5;

import java.util.HashMap;
import java.util.Map;

public class SDAHashSetImpl<E> implements SDAHashSet<E> {

    private final Map<E, Object> map = new HashMap<>();

    @Override
    public void add(E element) {
        map.put(element, null);
    }

    @Override
    public void remove(E element) {
        map.remove(element);
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean contains(Object element) {
        return map.containsKey(element);
    }

    @Override
    public void clear() {
        map.clear();
    }
}
