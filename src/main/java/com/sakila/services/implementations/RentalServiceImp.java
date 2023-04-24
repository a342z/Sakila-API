package com.sakila.services.implementations;

import com.sakila.mappers.RentalMapper;
import com.sakila.models.dtos.RentalDto;
import com.sakila.models.entities.Rental;
import com.sakila.repositories.implementations.RentalRepositoryImp;
import com.sakila.services.interfaces.RentalService;

public class RentalServiceImp extends CrudServiceImp<Rental,RentalDto> implements RentalService {

    public RentalServiceImp() {
        super(new RentalRepositoryImp(), RentalMapper.INSTANCE);
    }

   
}
