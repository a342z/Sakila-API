package com.sakila.api.controllers;

import java.util.List;

import com.sakila.models.dtos.ActorDto;
import com.sakila.repositories.implementations.ActorRepositoryImp;
import com.sakila.services.implementations.ActorServiceImp;
import com.sakila.services.interfaces.ActorService;
import com.sakila.utils.EntityManagerUtil;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.NotFoundException;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("actors")
@Produces(MediaType.APPLICATION_JSON)
public class ActorController {
    private ActorService actorService = new ActorServiceImp(
            new ActorRepositoryImp(EntityManagerUtil.getEntityManager()));

    @GET
    public List<ActorDto> getAllActors() {
        List<ActorDto> actorDtos = actorService.getAll();
        System.out.println(actorDtos.get(0));
        EntityManagerUtil.releaseEntityManager();
        return actorDtos;
    }

    @GET
    @Path("{id}")
    public ActorDto getActor(@PathParam("id") int id) {
        ActorDto actorDto = actorService.getById(id);
        EntityManagerUtil.releaseEntityManager();
        if (actorDto == null) {
            throw new NotFoundException("Actor with ID " + id + " not found");
        }
        return actorDto;
    }

    @POST
    public void addActor(ActorDto actorDto) {
        actorService.add(actorDto);
        EntityManagerUtil.releaseEntityManager();
    }

}
