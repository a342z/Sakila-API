package com.sakila.services.implementations;

import java.util.ArrayList;
import java.util.List;

import com.sakila.mappers.ClassMapper;
import com.sakila.repositories.interfaces.CrudRepository;
import com.sakila.services.interfaces.CrudService;

public abstract class CrudServiceImp<T, D> implements CrudService<D>{
    private final CrudRepository<T> repository;
    private final ClassMapper<T, D> mapper;

    public CrudServiceImp(CrudRepository<T> repository, ClassMapper<T, D> mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<D> getAll() {
        List<D> dtos = new ArrayList<>();
        for (T entity : repository.getAll()) {
            dtos.add(mapper.toDto(entity));
        }
        return dtos;
    }

    public D getById(int id) {
        return mapper.toDto(repository.getById(id));
    }

    public void add(D dto) {
        T entity = mapper.toEntity(dto);
        repository.add(entity);
    }


    public void update(int id, D dto) {
        T entity = mapper.toEntity(dto);
        repository.update(entity);
    }

    public void delete(int id) {
        repository.delete(id);
    }

}