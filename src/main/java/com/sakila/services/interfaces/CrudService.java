package com.sakila.services.interfaces;

import java.util.List;

public interface CrudService<T> {
    List<T> getAll();

    T getById(int id);

    void add(T dto);

    void update(int id, T dto);

    void delete(int id);
}
