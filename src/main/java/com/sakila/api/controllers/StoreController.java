package com.sakila.api.controllers;

import com.sakila.models.dtos.StoreDto;
import com.sakila.services.implementations.StoreServiceImp;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("stores")
@Produces(MediaType.APPLICATION_JSON)
public class StoreController extends ResourceController<StoreDto> {
    public StoreController() {
        super(new StoreServiceImp());
    }
}
