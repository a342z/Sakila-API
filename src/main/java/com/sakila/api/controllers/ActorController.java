package com.sakila.api.controllers;

import java.util.List;

import com.sakila.models.dtos.ActorDto;
import com.sakila.repositories.implementations.ActorRepositoryImp;
import com.sakila.services.implementations.ActorServiceImp;
import com.sakila.utils.EntityManagerUtil;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("actors")
@Produces(MediaType.APPLICATION_JSON)
public class ActorController {
    private ActorServiceImp actorService = new ActorServiceImp(new ActorRepositoryImp(EntityManagerUtil.getEntityManager()));

    @GET
    public List<ActorDto> getAllActors() {
        List<ActorDto> actorDtos = actorService.getAll();
        EntityManagerUtil.releaseEntityManager();
        return actorDtos;
    }
    
}
