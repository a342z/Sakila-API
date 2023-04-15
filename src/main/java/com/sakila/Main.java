package com.sakila;

import java.time.Instant;
import java.util.List;

import com.sakila.models.dtos.ActorDto;
import com.sakila.repositories.implementations.ActorRepositoryImp;
import com.sakila.repositories.interfaces.ActorRepository;
import com.sakila.services.implementations.ActorServiceImp;
import com.sakila.services.interfaces.ActorService;
import com.sakila.utils.EntityManagerUtil;

public class Main {
    public static void main(String[] args) {

        ActorRepository actorRepository = new ActorRepositoryImp(EntityManagerUtil.getEntityManager());
        ActorService actorService = new ActorServiceImp(actorRepository);
        List<ActorDto> actors = actorService.getAll();
        System.out.println(actors.get(1));

        ActorDto actor = actorService.getById(203);
        actor.setLastName("zaki");
        actorService.update(203, actor);
        // ActorService actorService = new ActorServiceImp(new ActorRepositoryImp(EntityManagerUtil.getEntityManager()));
        // ActorService actorService = new ActorServiceImp(new ActorRepositoryImp(EntityManagerUtil.getEntityManager()));
        // System.out.println(actorService.getById(1));
    }
}
