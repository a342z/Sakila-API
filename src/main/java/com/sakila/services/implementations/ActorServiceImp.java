package com.sakila.services.implementations;

import java.util.ArrayList;
import java.util.List;

import com.sakila.mappers.ActorMapper;
import com.sakila.mappers.ActorMapperImpl;
import com.sakila.models.dtos.ActorDto;
import com.sakila.models.entities.Actor;
import com.sakila.repositories.interfaces.ActorRepository;
import com.sakila.services.interfaces.ActorService;

public class ActorServiceImp extends CrudServiceImp<Actor,ActorDto> implements ActorService {

    public ActorServiceImp(ActorRepository actorRepository) {
        super(actorRepository, new ActorMapperImpl());
    }

   
}
