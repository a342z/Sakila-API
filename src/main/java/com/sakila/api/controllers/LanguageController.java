package com.sakila.api.controllers;

import com.sakila.models.dtos.LanguageDto;
import com.sakila.services.implementations.LanguageServiceImp;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("languages")
@Produces(MediaType.APPLICATION_JSON)
public class LanguageController  extends ResourceController<LanguageDto>{
            
    public LanguageController() {
        super(new LanguageServiceImp());
    }

}