package com.sdaJavaAdvanced.multitopic.shopapp.app.repository;

import com.sdaJavaAdvanced.multitopic.shopapp.app.model.Sellable;

import java.util.Optional;

public interface SellableRepository<T extends Sellable> {

    void add(T item);

    Optional<T> search(String id);

    void remove(String id);

    Optional<T> findByName(String id);
}
