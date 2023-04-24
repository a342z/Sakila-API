package com.sakila.api.controllers;

import com.sakila.models.dtos.ActorDto;
import com.sakila.services.implementations.ActorServiceImp;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
@Path("actors")
@Produces(MediaType.APPLICATION_JSON)
public class ActorController extends ResourceController<ActorDto> {
    public ActorController() {
        super(new ActorServiceImp());
    }
}
