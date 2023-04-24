package com.sakila.api.controllers;

import com.sakila.models.dtos.FilmDto;
import com.sakila.services.implementations.FilmServiceImp;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("films")
@Produces(MediaType.APPLICATION_JSON)
public class FilmController extends ResourceController<FilmDto>{
    public FilmController() {
        super(new FilmServiceImp());
    }
}
