package com.sakila.soap.services.interfaces;

import com.sakila.models.dtos.ActorDto;
import jakarta.jws.WebService;

@WebService
public interface ActorService  extends CrudService<ActorDto> {
    
}
