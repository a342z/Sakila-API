package com.sakila;

import com.sakila.repositories.implementations.ActorRepositoryImp;
import com.sakila.services.implementations.ActorServiceImp;
import com.sakila.utils.EntityManagerUtil;

public class Main {
    public static void main(String[] args) {
        // ActorService actorService = new ActorService(new ActorRepositoryImp(EntityManagerUtil.getEntityManager()));
        ActorServiceImp actorService = new ActorServiceImp(new ActorRepositoryImp(EntityManagerUtil.getEntityManager()));
        System.out.println(actorService.getById(1));
    }
}
