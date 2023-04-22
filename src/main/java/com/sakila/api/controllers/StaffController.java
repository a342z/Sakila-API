package com.sakila.api.controllers;

import com.sakila.models.dtos.StaffDto;
import com.sakila.services.implementations.StaffServiceImp;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("staff")
@Produces(MediaType.APPLICATION_JSON)
public class StaffController extends ResourceController<StaffDto> {
    public StaffController() {
        super(new StaffServiceImp());
    }
}
