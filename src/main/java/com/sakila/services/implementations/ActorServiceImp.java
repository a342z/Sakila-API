package com.sakila.services.implementations;

import com.sakila.mappers.ActorMapper;
import com.sakila.models.dtos.ActorDto;
import com.sakila.models.entities.Actor;
import com.sakila.repositories.implementations.ActorRepositoryImp;
import com.sakila.repositories.interfaces.ActorRepository;
import com.sakila.services.interfaces.ActorService;

public class ActorServiceImp extends CrudServiceImp<Actor,ActorDto> implements ActorService {

    public ActorServiceImp() {
        super(new ActorRepositoryImp(), ActorMapper.INSTANCE);
    }

   
}
