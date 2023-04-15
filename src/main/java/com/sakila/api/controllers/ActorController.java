package com.sakila.api.controllers;

import java.net.URI;
import java.time.Instant;
import java.util.List;

import com.sakila.models.dtos.ActorDto;
import com.sakila.repositories.implementations.ActorRepositoryImp;
import com.sakila.services.implementations.ActorServiceImp;
import com.sakila.services.interfaces.ActorService;
import com.sakila.utils.EntityManagerUtil;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.NotFoundException;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriInfo;

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

    @PUT
    @Path("{id}")
    public Response updateActor(@PathParam("id") int id, ActorDto updatedActorDto) {
        ActorDto existingActorDto = actorService.getById(id);
        if (existingActorDto == null) {
            throw new NotFoundException("Actor with ID " + id + " not found");
        }
        existingActorDto.setFirstName(updatedActorDto.getFirstName());
        existingActorDto.setLastName(updatedActorDto.getLastName());
        existingActorDto.setLastUpdate(Instant.now());
        actorService.update(id, existingActorDto);
        EntityManagerUtil.releaseEntityManager();
        return Response.ok().entity("Actor with ID " + id + " updated").build();
    }

    @DELETE
    @Path("{id}")
    public Response deleteActor(@PathParam("id") int id) {
        ActorDto actor = actorService.getById(id);
        if (actor == null) {
            throw new NotFoundException("Actor with ID " + id + " not found");
        }
        actorService.delete(actor.getId());
        EntityManagerUtil.releaseEntityManager();
        return Response.ok().entity("Actor with ID " + id + " deleted").build();
    }

    @POST
    public Response addActor(ActorDto actorDto, @Context UriInfo uriInfo) {
        ActorDto dto = actorService.add(actorDto);
        EntityManagerUtil.releaseEntityManager();
        URI resourceUri = uriInfo.getAbsolutePathBuilder().path(String.valueOf(dto.getId())).build();
        return Response.created(resourceUri).entity("New actor added with ID: " + dto.getId()).build();
    }

}
