package com.sakila;

import com.sakila.mappers.ActorMapper;
import com.sakila.models.dtos.ActorDto;
import com.sakila.models.entities.Actor;
import com.sakila.repositories.implementations.HibernateActorRepository;
import com.sakila.repositories.interfaces.ActorRepository;
import com.sakila.services.ActorService;
import com.sakila.utils.EntityManagerUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        ActorService actorService = new ActorService(new HibernateActorRepository(EntityManagerUtil.getEntityManager()));
        System.out.println(actorService.getActorById(1));
    }
}
