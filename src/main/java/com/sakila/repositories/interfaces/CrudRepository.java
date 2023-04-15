package com.sakila.repositories.interfaces;

import java.util.List;

public interface CrudRepository<T> {
    List<T> getAll();

    T getById(int id);

    T add(T entity);

    T update(T entity);

    void delete(int id);
}