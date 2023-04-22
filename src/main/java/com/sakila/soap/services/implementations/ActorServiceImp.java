package com.sakila.soap.services.implementations;

import com.sakila.mappers.ActorMapper;
import com.sakila.models.dtos.ActorDto;
import com.sakila.models.entities.Actor;
import com.sakila.repositories.implementations.ActorRepositoryImp;
import com.sakila.soap.services.interfaces.ActorService;
import jakarta.jws.WebService;

@WebService(endpointInterface = "com.sakila.soap.services.interfaces.ActorService" )
public class ActorServiceImp extends CrudServiceImp<Actor,ActorDto> implements ActorService {

    public ActorServiceImp() {
        super(new ActorRepositoryImp(), ActorMapper.INSTANCE);
    }

   
}
