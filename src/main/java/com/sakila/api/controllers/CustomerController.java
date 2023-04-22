package com.sakila.api.controllers;

import com.sakila.models.dtos.CustomerDto;
import com.sakila.models.dtos.StoreDto;
import com.sakila.services.implementations.CustomerServiceImp;
import com.sakila.services.implementations.StoreServiceImp;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("customers")
@Produces(MediaType.APPLICATION_JSON)
public class CustomerController extends ResourceController<CustomerDto> {
    public CustomerController() {
        super(new CustomerServiceImp());
    }
}
