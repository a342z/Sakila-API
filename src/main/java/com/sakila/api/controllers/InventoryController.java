package com.sakila.api.controllers;

import com.sakila.models.dtos.StoreDto;
import com.sakila.services.implementations.StoreServiceImp;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("inventories")
@Produces(MediaType.APPLICATION_JSON)
public class InventoryController extends ResourceController<StoreDto> {
    public InventoryController() {
        super(new StoreServiceImp());
    }
}
