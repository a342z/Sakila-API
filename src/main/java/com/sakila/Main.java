package com.sakila;

import com.sakila.mappers.ActorMapper;
import com.sakila.models.dtos.ActorDto;
import com.sakila.models.entities.Actor;
import com.sakila.repositories.implementations.HibernateActorRepository;
import com.sakila.repositories.interfaces.ActorRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory("pu");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        ActorRepository actorRepo = new HibernateActorRepository(entityManager);
        Actor actor =  actorRepo.getActorById(1);
        ActorDto actorDto = ActorMapper.INSTANCE.toDto(actor);
        System.out.println(actorDto);  
    }
}
