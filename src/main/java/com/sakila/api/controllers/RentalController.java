package com.sakila.api.controllers;

import com.sakila.models.dtos.RentalDto;
import com.sakila.models.dtos.StoreDto;
import com.sakila.services.implementations.RentalServiceImp;
import com.sakila.services.implementations.StoreServiceImp;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("rentals")
@Produces(MediaType.APPLICATION_JSON)
public class RentalController extends ResourceController<RentalDto> {
    public RentalController() {
        super(new RentalServiceImp());
    }
}
