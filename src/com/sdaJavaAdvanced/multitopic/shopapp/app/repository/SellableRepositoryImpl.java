package com.sdaJavaAdvanced.multitopic.shopapp.app.repository;

import com.sdaJavaAdvanced.multitopic.shopapp.app.model.Sellable;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class SellableRepositoryImpl<T extends Sellable> implements SellableRepository<T> {

    private Map<String, T> sellableById = new HashMap<>();

    @Override
    public void add(T item) {
        sellableById.put(item.getId(), item);
    }

    @Override
    public Optional<T> search(String id) {
        T item = sellableById.get(id);
        return Optional.ofNullable(item);
    }

    @Override
    public void remove(String id) {
        sellableById.remove(id);
    }

    @Override
    public Optional<T> findByName(String name) {
        return sellableById.values()
                .stream()
                .filter(item -> item.getName().equals(name))
                .findAny();
    }
}
