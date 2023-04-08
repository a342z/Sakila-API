package com.sakila.api.controllers;

import java.util.List;

import com.sakila.models.dtos.ActorDto;
import com.sakila.repositories.implementations.HibernateActorRepository;
import com.sakila.services.ActorService;
import com.sakila.utils.EntityManagerUtil;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("actors")
@Produces(MediaType.APPLICATION_JSON)
public class ActorController {
    private ActorService actorService = new ActorService(new HibernateActorRepository(EntityManagerUtil.getEntityManager()));

    @GET
    public List<ActorDto> getAllActors() {
        List<ActorDto> actorDtos = actorService.getAllActors();
        EntityManagerUtil.releaseEntityManager();
        return actorDtos;
    }
    
}
