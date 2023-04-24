package com.sakila.soap.services.implementations;

import com.sakila.mappers.ClassMapper;
import com.sakila.repositories.interfaces.CrudRepository;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.ArrayList;
import java.util.List;

@WebService
public abstract class CrudServiceImp<T, D>  {
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
        
        System.out.println(mapper.toDto(repository.getById(id)));
        return mapper.toDto(repository.getById(id));
    }

    
    public D add(D dto) {
        T entity = mapper.toEntity(dto);
        T savedEntity = repository.add(entity);
        return mapper.toDto(savedEntity);
    }

    
    public void update(int id, D dto) {
        T entity = mapper.toEntity(dto);
        repository.update(entity);
    }

    
    public void delete(int id) {
        repository.delete(id);
    }

}