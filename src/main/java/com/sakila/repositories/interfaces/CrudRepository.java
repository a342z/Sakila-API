package com.sakila.repositories.interfaces;

import java.util.List;

public interface CrudRepository<T> {
    List<T> getAll();
    T getById(int id);
    void add(T entity);
    void update(T entity);
    void delete(int id);
}