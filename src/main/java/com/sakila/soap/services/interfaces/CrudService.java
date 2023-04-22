package com.sakila.soap.services.interfaces;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public interface CrudService<T> {
    @WebMethod
    List<T> getAll();
    @WebMethod
    T getById(int id);
    @WebMethod
    T add(T dto);
    @WebMethod
    void update(int id, T dto);
    @WebMethod
    void delete(int id);
}
