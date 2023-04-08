package com.sakila;

import com.sakila.model.entity.Actor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory("pu");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Actor actor =  entityManager.find(Actor.class,1);  
        System.out.println(actor.getFirstName());  
    }
}
