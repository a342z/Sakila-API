package com.sakila.repositories.implementations;

import com.sakila.models.entities.Actor;
import com.sakila.models.entities.Rental;
import com.sakila.repositories.interfaces.ActorRepository;
import com.sakila.repositories.interfaces.RentalRepository;
import com.sakila.utils.EntityManagerUtil;

public class RentalRepositoryImp extends CrudRepositoryImp<Rental> implements RentalRepository {

    public RentalRepositoryImp() {
        super(EntityManagerUtil.getEntityManager(), Rental.class);
    }

}
