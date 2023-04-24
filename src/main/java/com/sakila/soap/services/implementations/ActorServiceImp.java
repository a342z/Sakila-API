package com.sakila.soap.services.implementations;

import java.util.ArrayList;
import java.util.List;

import com.sakila.mappers.ActorMapper;
import com.sakila.models.dtos.ActorDto;
import com.sakila.models.entities.Actor;
import com.sakila.repositories.implementations.ActorRepositoryImp;
import com.sakila.repositories.interfaces.ActorRepository;


import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public class ActorServiceImp {
    ActorRepository repository ;
    ActorMapper mapper;

    public ActorServiceImp() {
        mapper = ActorMapper.INSTANCE;
        repository = new ActorRepositoryImp();
    }

    public List<ActorDto> getAll() {
        List<ActorDto> dtos = new ArrayList<>();
        for (Actor entity : repository.getAll()) {
            dtos.add(mapper.toDto(entity));
        }
        return dtos;
    }
    
    
    public ActorDto getById(int id) {
        System.out.println(mapper.toDto(repository.getById(id)));
        return mapper.toDto(repository.getById(id));
    }

    
    public ActorDto add(ActorDto dto) {
        Actor entity = mapper.toEntity(dto);
        Actor savedEntity = repository.add(entity);
        return mapper.toDto(savedEntity);
    }

    
    public void update(int id, ActorDto dto) {
        Actor entity = mapper.toEntity(dto);
        repository.update(entity);
    }

    
    public void delete(int id) {
        repository.delete(id);
    }


   
}
