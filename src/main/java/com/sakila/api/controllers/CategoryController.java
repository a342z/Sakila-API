package com.sakila.api.controllers;

import com.sakila.models.dtos.CategoryDto;
import com.sakila.services.implementations.CategoryServiceImp;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("categories")
@Produces(MediaType.APPLICATION_JSON)
public class CategoryController  extends ResourceController<CategoryDto>{
            
    public CategoryController() {
        super(new CategoryServiceImp());
    }

}

