package com.sakila.repositories.implementations;

import com.sakila.models.entities.Actor;
import com.sakila.repositories.interfaces.ActorRepository;
import com.sakila.utils.EntityManagerUtil;

public class ActorRepositoryImp extends CrudRepositoryImp<Actor> implements ActorRepository {

    public ActorRepositoryImp() {
        super(EntityManagerUtil.getEntityManager(), Actor.class);
    }

}
